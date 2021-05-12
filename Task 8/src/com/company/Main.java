package com.company;

public class Main {

    public static void main(String[] args) {


        int [] mas = { 8, 8, 9, 6, 3, 3, 3, 5};

        int a = 0;
        int d = 0;
        for(int i = 0; i < mas.length; i++){
            for(int j = i; j < mas.length-1; j++){
                if (mas[i] == mas[j]){
                    a = mas[i];
                    d++;

                }

            }
            System.out.print("элемент "+a+" встречается "+d+" раз\n");
            d = 0;
            break;
        }
    }
}
