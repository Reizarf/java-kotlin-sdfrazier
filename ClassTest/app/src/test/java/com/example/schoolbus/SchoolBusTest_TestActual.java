package com.example.schoolbus;
//package com.example.jacksonjson;
import static org.junit.Assert.*;
import java.util.ArrayList;//arraylist

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;//json import
import com.fasterxml.jackson.databind.ObjectWriter;//json import
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
    @Test
    public void toJSON() throws Exception {
        SchoolBus sb = new SchoolBus((double) (1990), (float) (2000), "George", false);
        //SchoolBus sb = new SchoolBus();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(sb);
        String expect = "{\"year\":1990.0,\"price\":2000.0,\"name\":\"George\",\"yellow\":false}";
        assertEquals(expect, json);
        System.out.println(json);
    }
    @Test
    public void fromJSON() throws Exception{
        SchoolBus sb = new SchoolBus();
        ObjectMapper mapper = new ObjectMapper();
        //string here
        String json = "{\n" +
                "   \"year\": 1990.0,\n"+
                "   \"price\": 2000.0,\n"+
                "   \"name\": \"George\",\n"+
                "   \"yellow\": false\n"+
                "}";

        sb = mapper.readValue(json,SchoolBus.class);
        assertEquals(1990.0,sb.getYear(),0);
        assertEquals(2000.0,sb.getPrice(),0);
        assertEquals("George",sb.getName());
        assertEquals("yellow",sb.isYellow(),false);
        System.out.println(json);
    }
    @Test
    public void printJson(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<SchoolBus> list = new ArrayList();

        //year;double
        //price;float
        //name;string
        //yellow;false
        SchoolBus sb = new SchoolBus(1990.0,2000.0f,"George",false);
        list.add(sb);

        SchoolBus sb1 = new SchoolBus(1991.0,2100.0f,"George's Brother",false);
        list.add(sb1);
        String jsonData = mapper.writeValueAsString(list);

//        try {
//            jsonData = mapper.writeValueAsString(list);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(jsonData);

    }
}
