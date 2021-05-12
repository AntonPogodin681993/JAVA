package com.company;


import java.util.ArrayList;

public class Box extends Shape {

    double emptySpace;


    public Box( double emptySpace) {
        super(emptySpace);
        this.emptySpace = emptySpace;

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
}
