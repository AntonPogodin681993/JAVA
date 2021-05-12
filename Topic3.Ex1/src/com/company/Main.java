package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static int bruteforceSearch(int[] array, double element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] sortedArray, int element, int low, int high) {
        int index = -1 ;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < element) {
                low = mid + 1;
            } else if (sortedArray[mid] > element) {
                high = mid - 1;
            } else if (sortedArray[mid] == element) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int [] generate(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {7, 2, 25, 14, 3, 1, 16};
//        int n = 50000000;
//        int[] array = generate(n);
        Arrays.sort(array);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите елемент для поиска: ");
        int element = scanner.nextInt();

        long time = System.nanoTime();
        System.out.println("Элемент " + element + " имеет " + bruteforceSearch(array, element) + " индекс в массиве");
        System.out.println("Время выполнения методом перебора:" + (System.nanoTime() - time) + " ns");

        long time2 = System.nanoTime();
        System.out.println("Элемент " + element + " имеет " +binarySearch(array, element, 0, array.length -1)+ " индекс в массиве");
        System.out.println("Время выполнения методом двоичного поиска:" + (System.nanoTime() - time2) + " ns");
    }


}
