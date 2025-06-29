package com.example.junitdemo.JUnitSetup1;

public class App {

    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method to check if a number is positive
    public boolean isPositive(int number) {
        return number > 0;
    }

    // Method to return a greeting message
    public String greet(String name) {
        if (name == null) {
            return null;
        }
        return "Hello, " + name + "!";
    }
}
