package com.example.Hello;

public class Soup implements AutoCloseable {
    private int temperature=0;//int
    private String name;//string
    private char size="L";//S,M,L
    private boolean isCold = false;//boolean

    Soup(float size, String name){
        this.size = size;
        this.name = name;
    }

    //getters and setters
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }
}