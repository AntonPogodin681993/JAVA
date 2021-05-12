package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //----------------Task1
//        for (int i=0; i < 10; i++ ){
//            ex1Thread thread = new ex1Thread();
//            System.out.println("Поток №" + (i+1));
//            thread.run();
//        }
//
//        //----------------Task2
//        Thread thread = new Thread();
//        System.out.println(thread.getState());
//        thread.start();
//        System.out.println(thread.getState());
//        thread.sleep(1000);
//        System.out.println(thread.getState());

        //----------------Task3
//        Counter c = new Counter();
//        for (int j = 0; j<100; j++ ){
//            new ex2Thread("Thread № " + j ,c).start();
//        }

        //----------------Task4
        Object object = new Object();
        new RepThread(object).start();
        new RepThread(object).start();

    }
}
