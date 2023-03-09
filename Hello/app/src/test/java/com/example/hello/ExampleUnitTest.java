package com.example.Hello;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}

public class SoupTest{

    public void close(){
    }

    public void isColdDefault(){
        SoupTest soup = new soup();
        assertFalse(soup.isCold());
    }

//    public void testTemperature(){
//        SoupTest soup = new Soup();
//        Soup.setTemperature()((int)10);//or short here
//        assertEquals(10,soup.getTemperature());
//    }
    public void setTempOk(){
        SoupTest soup = new soup;
        assertEquals(0,soup.getTemperature());

    }
    public void testSize(){
        SoupTest soup = new Soup();
        //soup.getSize
    }

}