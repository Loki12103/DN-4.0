package com.example1.logging_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.atInfo().log("Application started");

        try {
            simulateProcess();
        } catch (Exception e) {
            logger.atError().log(" Exception occurred: {}", e.getMessage());
        }

        logger.atWarn().log(" This is a warning message");
        logger.atDebug().log(" This is a debug message (visible only if log level is DEBUG)");
        logger.atInfo().log(" Application finished");
    }

    private static void simulateProcess() {
        logger.atInfo().log(" Simulating some process...");

        int a = 10;
        int b = 0;

        if (b == 0) {
            logger.atWarn().log(" Divider is zero, skipping division to avoid ArithmeticException");
        } else {
            int result = a / b;
            logger.atInfo().log("Division result: {}", result);
        }
    }
}
