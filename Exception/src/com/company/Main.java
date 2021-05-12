package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        try {
            double[][] array = {{1, 1,1}, {2, 0,3},{3,2,4}  };
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

        System.out.println("Задание №1\nМаксимальный элемент массива: " + MaxElement(array)+ "\n"+ "Задание №2");
        System.out.println(IfItIsSquareArray(array) + "\n"+ "Задание №3");
        System.out.println("Максимальная сумма равна: " + MaxSumOfRowElements(array));
    }
        catch (NullPointerException ex){ System.err.printf(ex.getMessage());}

    }





    public static double MaxElement(double[][] array) {

        double max = array[0][0];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {

                    if (array[i][j] > max) {
                        max = array[i][j];
                        }
                    if (array[i][j] < 0){ throw new IllegalArgumentException("Значение елементов массива не могут быть отрицательными");
                    }
                }

            }
        return max;
    }

    public static String IfItIsSquareArray (double [][] array){
        String st = " ";

        if (array.length == array[0].length){
            st = "Массив является квадратным";
        }
        else {
//            st = "Массив не является квадратным";
            throw new IllegalArgumentException ("Ваш массив не является квадратным");
        }
        return st;
    }


    public static double MaxSumOfRowElements (double [][] array){
        double sum;
        ArrayList<Double> ListOfSum = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                ListOfSum.add(sum);

            }


        }
        if(Collections.max(ListOfSum) == 0){throw new IllegalArgumentException("Максимальная сумма елементов строки не может быть null!!");}
        return Collections.max(ListOfSum);
    }



}

