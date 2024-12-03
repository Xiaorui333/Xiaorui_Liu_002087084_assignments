package org.example;

import com.example.jooq.Tables;
import io.github.stefanbratanov.jvm.openai.*;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class ChatUI {
    private JFrame frame;
    private JTextArea chatArea;
    private JPanel inputPanel;
    private JTextField inputField;
    private JButton sendButton;
    private List<ChatMessage> messageHistory;

    private static final String url = "postgresql://aws-0-us-west-1.pooler.supabase.com:6543/postgres";
    private static final String userName = "postgres.tqbovlsrhixnvhquimtz";
    private static final String password = "Frida1195433053#";
    Settings settings = new Settings()
            .withExecuteLogging(true)
            .withRenderFormatted(false);

    private DSLContext dslContext;

    public ChatUI() {
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES, settings);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An unexpected error occurred.");
        }
        messageHistory = new ArrayList<>();
        setupUI();
        loadMessageHistoryFromDatabase();
    }

    private void setupUI() {
        frame = new JFrame("Chat UI");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);

        inputPanel = new JPanel(new BorderLayout());
        frame.add(inputPanel, BorderLayout.SOUTH);

        inputField = new JTextField();
        sendButton = new JButton("Send");
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);



        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userMessage = inputField.getText();
                if (!userMessage.trim().isEmpty()) {
                    String modifiedMessage = userMessage + " Please provide a concise response and prioritize the first answer."; // Modify user message

                    chatArea.append("User: " + userMessage + "\n\n");
                    ChatMessage chatMessage = ChatMessage.userMessage(modifiedMessage);
                    messageHistory.add(chatMessage);
                    saveMessageToDatabase(chatMessage);
                    inputField.setText("");

                    String response = getAIResponse();
                    chatArea.append("AI: " + response + "\n\n");
                    ChatMessage aiMessage = ChatMessage.assistantMessage(response);
                    messageHistory.add(aiMessage);
                    saveMessageToDatabase(aiMessage);
                }
            }
        });

        frame.setVisible(true);
    }
    // check interface ChatMessage from io. github. stefanbratanov. jvm. openai
    public String getMessageContent(ChatMessage m) {
        if (m instanceof ChatMessage.SystemMessage systemMessage) {
            return systemMessage.content();
        } else if (m instanceof ChatMessage.UserMessage<?> userMessage) {
            // Handles both UserMessageWithTextContent and UserMessageWithContentParts
            return userMessage.content().toString();
        } else if (m instanceof ChatMessage.AssistantMessage assistantMessage) {
            return assistantMessage.content();
        } else if (m instanceof ChatMessage.ToolMessage toolMessage) {
            return toolMessage.content();
        } else {
            throw new IllegalArgumentException("Unknown ChatMessage type");
        }
    }


    private void saveMessageToDatabase(ChatMessage message) {
        try {

            // Insert the role and content into the database using jOOQ
            dslContext.insertInto(Tables.MESSAGE_HISTORY)
                    .set(Tables.MESSAGE_HISTORY.ROLE, message.role())
                    .set(Tables.MESSAGE_HISTORY.CONTENT, getMessageContent(message))
                    .execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to save message to database: " + e.getMessage());
        }
    }


    private void loadMessageHistoryFromDatabase() {
        try {
            dslContext.selectFrom(Tables.MESSAGE_HISTORY)
                    .fetch()
                    .forEach(record -> {
                        String role = record.get(Tables.MESSAGE_HISTORY.ROLE);
                        String content = record.get(Tables.MESSAGE_HISTORY.CONTENT);
                        ChatMessage message = "user".equals(role)
                                ? ChatMessage.userMessage(content)
                                : ChatMessage.assistantMessage(content);
                        messageHistory.add(message);
                        chatArea.append(role.substring(0, 1).toUpperCase() + role.substring(1) + ": " + content + "\n\n");
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private String getAIResponse() {
        String response = "";
        var apiKey = System.getenv("OPENAI_API_KEY");
        var builder = OpenAI.newBuilder(apiKey);
        OpenAI openAI = builder.build();

        ChatClient chatClient = openAI.chatClient();
        CreateChatCompletionRequest createChatCompletionRequest = CreateChatCompletionRequest.newBuilder()
                .model(OpenAIModel.GPT_3_5_TURBO)
                .messages(messageHistory)  // Send full message history
                .build();
        ChatCompletion chatCompletion = chatClient.createChatCompletion(createChatCompletionRequest);
        var choices = chatCompletion.choices();
        for (var m : choices) {
            response = m.message().content();
        }
        return response;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatUI::new); // Ensure the UI is created on the Event Dispatch Thread
    }
}
