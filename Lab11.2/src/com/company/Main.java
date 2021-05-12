package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] array = {20, 6, 7, 20, 3, 6, 6, 20, 25, 20, 30, 5};
        int index = 0;

        Map<Integer, Integer> map = new HashMap<>();

        do {
            if (!map.containsKey(array[index])){
                int qty = 1;
                for(int i = index+1; i < array.length; i++){
                    if (array[i] == array[index]){
                        qty++;
                    }
                }
                map.put(array[index], qty);
            }
            index++;
        } while (index < array.length);

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " встречается " + m.getValue() + " раза");
        }
    }
}
