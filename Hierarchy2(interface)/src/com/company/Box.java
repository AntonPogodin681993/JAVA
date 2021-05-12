package com.company;


import java.util.ArrayList;

public class Box implements Shape {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private double emptySpace;
    private double volume;


    public Box( double emptySpace) {

        this.emptySpace = emptySpace;
        this.volume = emptySpace;
    }

    public boolean add(Shape shape) {

        if (emptySpace >= shape.getVolume()) {
            shapes.add(shape);
            emptySpace -= shape.getVolume();
            System.out.println("Фигура поместилась, осталось " + emptySpace + " свободного места");
            return true;
        } else {
            System.out.println("Фигура не поместилась, необходимо увеличить объём коробки или уменьшить объём фигуры");
            return false;
        }
    }


    public ArrayList<Shape> getShapes(){
        return shapes;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
