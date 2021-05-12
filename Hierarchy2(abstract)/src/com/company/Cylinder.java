package com.company;

public class Cylinder extends SolidOfRevolution {
    private double height;

    @Override
    public double getVolume() {
        return  Math.PI * radius * radius * height;

    }




    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;

    }
}
