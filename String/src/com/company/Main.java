package com.company;

import java.util.ArrayList;


public class Main {



    public static void main(String[] args) {
        //1
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Rome");
        cities.add("Moscow");
        cities.add("Paris");

        //2
        String word = "дедаыпывап";
        //3
        String Byaka = "Получилась бяка";
        //4
        String s1 = "Весёлые каникулы, каникулы весёлые, люблю каникулы. Детские каникулы";
        String s2 = "каникулы";
        //5
        String sentence = "This is a test string";

        System.out.println("№1\n" + "Самая длинная строка " + showLongestString(cities));
        System.out.println("№2\n" + Palindrom(word));
        System.out.println("№3\n" + replaceByaka(Byaka));
        System.out.println("№4\n" +"В тексте : " + "\n" + s1 + "\n Слово " + s2 + " содержиться " + numberOfOccurrences(s1,s2) + " раз"  );
        System.out.println("№5\n" + "Исходный вид: " + sentence + "\nВ перевернутонм виде: " +reversWord(sentence));


    }

    public static String showLongestString (ArrayList<String> strings) {
        int maxStr = strings.get(0).length();
        int index = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > maxStr) {
                maxStr = strings.get(i).length();
                index = i;
            }
        }
        return strings.get(index);
    }

    public static String Palindrom (String s){
        String st;
        String revers = new StringBuilder(s).reverse().toString();
        if (s.equals(revers)){
            st = "Cлово "  + s + " - палиндром";
        }
        else{
            st = "Cлово " + s + " - не палиндром";
        }

        return st;
    }

    public static  String  replaceByaka (String s1){
        String s2 = s1.replaceAll("бяка", "[вырезано цензурой]" );
        return s2;
    }

    public static int numberOfOccurrences (String s1 , String s2){
        int count = 0;
        int startInd = -1;
        while (true)
        {
            startInd = s1.indexOf(s2 , startInd + 1);
            if (startInd < 0) break;
            count++;

        }
        return count;
    }


    public static String reversWord (String sentence){
        String [] splitWord = sentence.split(" ");
        String revString = "";
        for (int i = 0; i < splitWord.length; i++)
        {
            String word = splitWord[i];
            String revWord = "";
                for (int j = word.length() - 1; j>=0; j--){
                   revWord = revWord +  word.charAt(j);
                }

             revString = revString + revWord + " ";
        }
        return revString;
    }



}
