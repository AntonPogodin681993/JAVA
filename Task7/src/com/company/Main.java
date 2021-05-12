package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {0,1,2,2,3,0,4,2};

        int count = 0;

        for(int i=0; i <array.length;i++)
        {
            for (int j=0; j < array.length;j++) {
                if (array[i] == array[j]) {
                    count++;
                }

        }

        if (count == 1)
        {
            System.out.println("Первое уникальное число массива:" + array[i]);
            break;
        }

        count = 0;

      }
    }
}
