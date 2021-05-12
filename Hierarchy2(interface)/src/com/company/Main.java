package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину коробки: " );
        double a = scanner.nextDouble();
        System.out.println("Введите ширину коробки: " );
        double b = scanner.nextDouble();
        System.out.println("Введите высоту коробки: " );
        double h = scanner.nextDouble();
        double emptySpace = a * b * h;

        Ball ball = new Ball(60);
        Cylinder cylinder = new Cylinder(100, 6);
        Pyramid pyramid = new Pyramid(1, 1);
        Box box = new Box(emptySpace);


        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));

        ArrayList<Shape> shapes = box.getShapes();
        Collections.sort(shapes);
        for (Shape s : shapes){
            System.out.println(s);
        }


    }
}

