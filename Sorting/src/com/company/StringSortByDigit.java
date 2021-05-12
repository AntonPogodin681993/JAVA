package com.company;

import java.util.Comparator;

class StringSortByDigit implements Comparator<String> {

    public int countOfDigit (String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }


    @Override
    public int compare(String s1, String s2) {
        if ( countOfDigit(s1) > countOfDigit(s2)){
            return 1;
        }
        else{
            if (countOfDigit(s1) < countOfDigit(s2)){
                return  -1;
            }
            else{
                return 0;
            }
        }

    }

}
