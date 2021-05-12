package com.company;

public class RepThread extends Thread {

    Object object;

   public RepThread (Object object){
       this.object = object;
   }

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                try {
                    System.out.println(getName());
                    object.notify();
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

