package com.company;

public class Pyramid extends Shape{
    private double height;
    private double s; // площадь основания пирамиды

    @Override
    public double getVolume(){
        return  height * s * 4 / 3;
    }


    public Pyramid(double height, double s) {
        this.height = height;
        this.s = s;
    }
}
