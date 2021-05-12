package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: \n");
        String st1 = scanner.next();
        System.out.println("Введите второе слово \n");
        String st2 = scanner.next();
        System.out.println("Введите тертье слово \n");
        String st3 = scanner.next();

        StringBuilder completeString = new StringBuilder("");
        completeString.append(st1);
        completeString.append(",");
        completeString.append(st2);
        completeString.append(",");
        completeString.append(st3);
        System.out.println(completeString.toString());

    }
}
