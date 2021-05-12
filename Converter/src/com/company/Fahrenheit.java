package com.company;

public class Fahrenheit extends BaseConverter {


    public Fahrenheit(double degrees) {
        super((degrees* 1.8) + 32);
    }
}
