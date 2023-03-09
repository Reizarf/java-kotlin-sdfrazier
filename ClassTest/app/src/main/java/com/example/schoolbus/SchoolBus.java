package com.example.schoolbus;

public class SchoolBus {
    private double year;
    private float price;
    private String name;
    private boolean isYellow = true;

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

    //public static void

    SchoolBus(double year, float price,String name, boolean isYellow){
        this.year = year;
        this.price = price;
        this.name = name;
        this.isYellow = isYellow;
    }

    SchoolBus(){
        this(2000,2000,"George",false);
    }//default constructor
}


