/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        ChatUI chatUI = new ChatUI();
        System.out.println(new App().getGreeting());

    }
}
