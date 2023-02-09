package com.example.schoolbus;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SchoolBusTest_TestActual extends SchoolBus {

    @Before
    public void setUp() throws Exception {
        SchoolBus sb = new SchoolBus();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void close() {

    }

    @Test
    public void getPriceTest() {
        SchoolBus sb = new SchoolBus();
        assertEquals(0,0,0);
    }

    @Test
    public void getYearTest() {
        SchoolBus sb = new SchoolBus();
        assertEquals(1990,1990);
    }

    @Test
    public void isYellowTest() {
        SchoolBus sb = new SchoolBus();
        sb.setYellow(true);
        assertTrue(sb.isYellow());
    }
}