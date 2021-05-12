package com.company;


import java.util.ArrayList;

public class Box extends Shape {

    private double emptySpace;
    private double volume;


    public Box( double emptySpace) {

        this.emptySpace = emptySpace;
        this.volume = emptySpace;
    }

    public boolean add(Shape shape) {

        if (emptySpace >= shape.getVolume()) {
            emptySpace -= shape.getVolume();
            System.out.println("Фигура поместилась, осталось " + emptySpace + " свободного места");
            return true;
        } else {
            System.out.println("Фигура не поместилась, необходимо увеличить объём коробки или уменьшить объём фигуры");
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
