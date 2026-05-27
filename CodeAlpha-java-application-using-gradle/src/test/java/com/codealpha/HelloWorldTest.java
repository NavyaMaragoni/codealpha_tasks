package com.codealpha;

import org.junit.Test;
import static org.junit.Assert.*;

// This is a test file - it checks if our code works correctly
public class HelloWorldTest {

    @Test
    public void testGreetUser() {
        HelloWorld app = new HelloWorld();

        // Call the method
        String result = app.greetUser("Alice");

        // Check that the result contains the name
        assertTrue(result.contains("Alice"));
        System.out.println("Test passed! greetUser works correctly.");
    }
}
