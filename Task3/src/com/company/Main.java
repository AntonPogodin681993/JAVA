package com.company;

public class Main {

    public static void main(String[] args) {

        int n = 10;
        double[] array = new double[n];
        System.out.print("Созданный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            System.out.print(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print( "Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }
}
