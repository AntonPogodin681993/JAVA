package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {7, 2, 25, 14, 3, 1, 16};
        System.out.println("Не отсортированный массив: " + Arrays.toString(array) );
        selectionSort(array);
        System.out.println( "Отсортированный массив: " + Arrays.toString(array));


	// write your code here
    }

    public static void selectionSort (int[] elements){
        int min, temp;

        for (int index = 0; index < elements.length; index++){
            min = index;
            for (int scan = index+1; scan < elements.length; scan++){
                if (elements[scan] < elements[min])
                    min = scan;
            }

            temp = elements[min];
            elements[min] = elements[index];
            elements[index] = temp;
        }
    }
}
