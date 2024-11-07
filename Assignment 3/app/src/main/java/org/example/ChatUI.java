package org.example;

import io.github.stefanbratanov.jvm.openai.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ChatUI {
    private JFrame frame;
    private JTextArea chatArea;
    private JPanel inputPanel;
    private JTextField inputField;
    private JButton sendButton;
    private List<ChatMessage> messageHistory;  // Store full message history for each request

    public ChatUI() {
        messageHistory = new ArrayList<>();  // Initialize message history
        setupUI();
    }

    private void setupUI() {
        frame = new JFrame("Chat UI");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
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
                    messageHistory.add(ChatMessage.userMessage(modifiedMessage));  // Add modified user message to history
                    inputField.setText("");

                    String response = getAIResponse();
                    chatArea.append("AI: " + response + "\n\n");
                    messageHistory.add(ChatMessage.assistantMessage(response));  // Add AI response to history
                }
            }
        });

        frame.setVisible(true);
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
            response = m.message().content();  // Get the AI's response
        }
        return response;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatUI::new); // Ensure the UI is created on the Event Dispatch Thread
    }
}
