package com.company;

public class Rankine extends BaseConverter {
    public Rankine(double degrees) {
        super((degrees + 273.15) * 1.8);
    }
}
