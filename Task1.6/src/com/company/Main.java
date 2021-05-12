package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] array = {0,1,2,2,3,0,4,2};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = scanner.nextInt();
        int offset = 0;

        for(int i = 0; i< array.length; i++) {
            if (array[i] == N) {
                offset++;
            } else
                {
                array[i - offset] = array[i];
                }
        }


        System.out.println(Arrays.toString(Arrays.copyOf(array, array.length - offset)));
    }



}
