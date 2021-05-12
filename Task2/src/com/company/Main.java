package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N:");
        double N = scanner.nextDouble();
        System.out.print("Введите степень k:");
        double k  = scanner.nextDouble();

        double sum = 0;

        for (double i = 1; i<=N; i++)
        {
            sum += Math.pow(i,k);
        }

        System.out.println("Алгебраическая сумма равна:"+ sum);
	// write your code here
    }
}
