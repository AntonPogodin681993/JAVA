package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] cities = new String[4];
        System.out.println("Заполните массив " + cities.length + " значениями: " );
        for (int i = 0; i <cities.length; i++) {
            cities[i] = scan.next();
        }
        Comparator<String> stringLenghtComparator = new StringLengthSort();
        Comparator<String> stringSortByDigit = new StringSortByDigit();
        Arrays.sort(cities);
        System.out.println("Массив отсортированный по алфавиту: " + Arrays.toString((cities)));
        Arrays.sort(cities, stringLenghtComparator);
        System.out.println("Массив отсортированный по длине строки: " + Arrays.toString(cities));
        Arrays.sort(cities,stringSortByDigit);
        System.out.println("Массив отсортированные по кол-ву цыфр: " + Arrays.toString(cities));




    }
}
