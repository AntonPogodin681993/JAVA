package com.company;

class Counter {
        int count = 0 ;


        synchronized  public void increment() {
        count = count + 1 ;
        }


        public int getCount() {
        return count ;
        }
}

 public  class ex2Thread extends Thread{
        private  Counter c ;
        ex2Thread(String name, Counter c){
                super(name);
                this.c = c;
        }
        @Override
        public void run() {
                for (int i = 0; i < 1000; i++){
                     c.increment();
                }
                System.out.println("У потока " + getName() + " счетчик равен " + c.getCount());
        }
}