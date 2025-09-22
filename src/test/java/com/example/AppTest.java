package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testAppHasGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testAddMethod() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
        assertEquals(0, app.add(-1, 1));
    }
}