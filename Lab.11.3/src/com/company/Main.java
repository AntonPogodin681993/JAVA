package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random()*100));
        }
        System.out.println("Вот наш не отсортированный массив");
        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }

        Arrays.sort(array);
        System.out.println("\nВот наш отсортированный массив");
        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }

        Thread thread = new Thread(() -> {
            System.out.println("\nВведите искомую цифру");
            boolean result = false;
            int search = scanner.nextInt();
            int low = 0;
            int mid = 0;
            int high = array.length - 1;
            while (low <= high){
                mid = (low + high) / 2;
                if (array[mid] == search){
                    result = true;
                    break;
                }
                if (array[mid] > search) high = mid - 1; else low = mid + 1;
            }

            System.out.println(" Содержиться ли " + search + " в массиве?\nОтвет: " + result);


        });
        thread.start();







    }
}
