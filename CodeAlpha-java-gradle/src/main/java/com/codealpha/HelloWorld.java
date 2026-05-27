package com.codealpha;

// This is the main Java class
// It prints a welcome message when you run it

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("  Hello from CodeAlpha!      ");
        System.out.println("  Java + Gradle Project      ");
        System.out.println("=============================");

        // Create an object and call a method
        HelloWorld app = new HelloWorld();
        app.greetUser("BTech Student");
    }

    // A simple method that greets a user
    public String greetUser(String name) {
        String message = "Welcome, " + name + "! Your Gradle build works!";
        System.out.println(message);
        return message;
    }
}
