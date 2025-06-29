package com.example.junitdemo.JUnitSetup1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    public void testAddition() {
        assertEquals(8, app.add(5, 3));
    }

    @Test
    public void testIsPositiveTrue() {
        assertTrue(app.isPositive(10));
    }

    @Test
    public void testIsPositiveFalse() {
        assertFalse(app.isPositive(-5));
    }

    @Test
    public void testGreeting() {
        assertEquals("Hello, Lokesh!", app.greet("Lokesh"));
    }

    @Test
    public void testGreetingWithNull() {
        assertNull(app.greet(null));
    }
}
