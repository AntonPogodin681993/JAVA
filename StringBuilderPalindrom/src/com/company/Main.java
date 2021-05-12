package com.company;

public class Main {

    public static void main(String[] args) {
        String word = "Дед";
        System.out.println("№2\n" + Palindrom(word));

    }

    public static boolean Palindrom (String s){

        if(s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) return  true;
        else return false;

    }
}
