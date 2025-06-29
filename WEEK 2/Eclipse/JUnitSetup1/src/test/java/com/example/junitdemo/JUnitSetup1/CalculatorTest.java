package com.example.junitdemo.JUnitSetup1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println(" Setup: Calculator instance created");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println(" Teardown: Calculator instance destroyed");
    }

    @Test
    public void testAdd() {
        
        int a = 10, b = 5;

        
        int result = calculator.add(a, b);

        
        assertEquals(15, result);
        System.out.println("testAdd passed");
    }

    @Test
    public void testMultiply() {
        
        int a = 4, b = 3;

        
        int result = calculator.multiply(a, b);

        
        assertEquals(12, result);
        System.out.println(" testMultiply passed");
    }

    @Test
    public void testDivideByZero() {
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });

        
        assertEquals("Cannot divide by zero", exception.getMessage());
        System.out.println(" testDivideByZero passed");
    }
}
