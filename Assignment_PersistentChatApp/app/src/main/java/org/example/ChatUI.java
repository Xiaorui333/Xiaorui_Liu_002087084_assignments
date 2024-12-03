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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChatUI {
    private JFrame frame;
    private JTextArea chatArea;
    private JPanel inputPanel;
    private JTextField inputField;
    private JButton sendButton;
    private List<ChatMessage> messageHistory;

    private static final String DATABASE_URL = "jdbc:postgresql://aws-0-us-west-1.pooler.supabase.com:6543/postgres";
    private static final String DATABASE_USERNAME = "postgres.tqbovlsrhixnvhquimtz";
    private static final String DATABASE_PASSWORD = "Frida1195433053#";

    private DSLContext dslContext;

    public ChatUI() {
        try {
            initializeDatabaseConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to connect to the database. Exiting...");
            System.exit(1); // Exit if the database connection fails
        }

        messageHistory = new ArrayList<>();
        setupUI();
        loadMessageHistoryFromDatabase();
    }

    private void initializeDatabaseConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
        Settings settings = new Settings()
                .withExecuteLogging(true)
                .withRenderFormatted(false);
        dslContext = DSL.using(connection, SQLDialect.POSTGRES, settings);
        System.out.println("Database connection established successfully!");
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
                String userMessage = inputField.getText().trim();
                if (!userMessage.isEmpty()) {
                    handleUserMessage(userMessage);
                }
            }
        });

        frame.setVisible(true);
    }

    private void handleUserMessage(String userMessage) {
        chatArea.append("User: " + userMessage + "\n\n");

        ChatMessage userChatMessage = ChatMessage.userMessage(userMessage);
        messageHistory.add(userChatMessage);
        saveMessageToDatabase(userChatMessage);

        String aiResponse = getAIResponse();
        chatArea.append("AI: " + aiResponse + "\n\n");

        ChatMessage aiChatMessage = ChatMessage.assistantMessage(aiResponse);
        messageHistory.add(aiChatMessage);
        saveMessageToDatabase(aiChatMessage);

        inputField.setText("");
    }

    private void saveMessageToDatabase(ChatMessage message) {
        try {
            dslContext.insertInto(Tables.MESSAGE_HISTORY)
                    .set(Tables.MESSAGE_HISTORY.ROLE, message.role())
                    .set(Tables.MESSAGE_HISTORY.CONTENT, getMessageContent(message))
                    .execute();
            System.out.println("Message saved to database: " + message.role());
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

                        ChatMessage message = "user".equalsIgnoreCase(role)
                                ? ChatMessage.userMessage(content)
                                : ChatMessage.assistantMessage(content);

                        messageHistory.add(message);
                        chatArea.append(role.substring(0, 1).toUpperCase() + role.substring(1) + ": " + content + "\n\n");
                    });
            System.out.println("Chat history loaded from database.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to load chat history from database.");
        }
    }

    public String getMessageContent(ChatMessage message) {
        if (message instanceof ChatMessage.SystemMessage systemMessage) {
            return systemMessage.content();
        } else if (message instanceof ChatMessage.UserMessage<?> userMessage) {
            return userMessage.content().toString();
        } else if (message instanceof ChatMessage.AssistantMessage assistantMessage) {
            return assistantMessage.content();
        } else if (message instanceof ChatMessage.ToolMessage toolMessage) {
            return toolMessage.content();
        } else {
            throw new IllegalArgumentException("Unknown ChatMessage type");
        }
    }

    private String getAIResponse() {
        try {
            String apiKey = System.getenv("OPENAI_API_KEY");
            OpenAI openAI = OpenAI.newBuilder(apiKey).build();
            ChatClient chatClient = openAI.chatClient();

            CreateChatCompletionRequest request = CreateChatCompletionRequest.newBuilder()
                    .model(OpenAIModel.GPT_3_5_TURBO)
                    .messages(messageHistory)
                    .build();

            ChatCompletion completion = chatClient.createChatCompletion(request);
            return completion.choices().get(0).message().content();
        } catch (Exception e) {
            e.printStackTrace();
            return "Sorry, I couldn't process your request.";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatUI::new);
    }
}

