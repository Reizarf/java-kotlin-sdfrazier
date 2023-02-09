package com.example.schoolbus;

public class SchoolBus {
    private double year;
    private float price;
    private String name;
    private boolean isYellow = true;


//3 different variable types
    //all getters and setters complete

    public boolean isYellow() {
        return isYellow;
    }

    public void setYellow(boolean yellow) {
        isYellow = yellow;
    }
    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
