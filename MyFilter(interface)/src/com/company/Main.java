package com.company;

interface Filter {
    boolean apply(Object o);
}





public class Main {

    public static void main(String[] args) {

        String [] array = new String[]{"cat", "dog", "snake", "bear","sky"};
        Object target = "dog";
        MyFilter filt = new MyFilter(array,target);
        filt.filter();




    }
}
