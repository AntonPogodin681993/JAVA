package com.company;

import java.util.Scanner;

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

        Ball ball = new Ball(3);
        Cylinder cylinder = new Cylinder(2, 5);
        Pyramid pyramid = new Pyramid(10, 10);

        Box box = new Box(emptySpace);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
    }
}
