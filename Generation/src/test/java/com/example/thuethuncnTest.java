package com.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class thuethuncnTest {
    thuethuncn call;

    @BeforeMethod
    public void setUp() {
        call = new thuethuncn();
    }

    @AfterMethod
    public void tearDown() {
        call = null;
    }

    @Test
    public void testThue() {
        assertEquals(call.thue(5000000), 250000);
        assertEquals(call.thue(10000000), 1250000);
        assertEquals(call.thue(18000000), 3450000);
        assertEquals(call.thue(32000000), 8350000);
        assertEquals(call.thue(52000000), 17750000);
        assertEquals(call.thue(80000000), 33750000);
    }
}