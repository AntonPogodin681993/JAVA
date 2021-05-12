package com.company;

public class Main {

    public static void main(String[] args) {
        Integer [] array = {14, 62, 85, 7, 98, 8, 4, 22, 16} ;
        Integer [][] array2 = {{8, 56,34, 7, 45}, {4, 4, 3, 44, 23}};
        IteratorForSingleRowArray<Integer> firstIterator = new IteratorForSingleRowArray(array);
        IteratorForDoubleRowArray<Integer> secondInerator = new IteratorForDoubleRowArray(array2);


        while (firstIterator.hasNext()) {
            System.out.println("Одномерный массив:  " + firstIterator.next());
        }

        while (secondInerator.hasNext()) {
            System.out.println("Двумерный массив: " + secondInerator.next());
        }
    }



}
