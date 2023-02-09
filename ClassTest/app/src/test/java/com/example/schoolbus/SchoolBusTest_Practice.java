package com.example.schoolbus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;//import for assert*

public class SchoolBusTest_Practice {

//    private double year;*
//    private float price;*
//    private String name;
    public void close(){

    }
    public void getPriceTest(){
        SchoolBus sb = new SchoolBus();
        assertEquals(0,0,0);
    }
    public void getYearTest(){
        SchoolBus sb = new SchoolBus();
        assertEquals(1990,1990);
    }
    //public void getNameTest(){
//        SchoolBus sb = new SchoolBus();
//        assertEq
//    }
    public void isYellowTest(){
        SchoolBus sb = new SchoolBus();
        sb.setYellow(true);
        assertTrue(sb.isYellow());
    }
}
