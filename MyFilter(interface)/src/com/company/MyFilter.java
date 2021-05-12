package com.company;

public class MyFilter implements Filter {

   protected Object[] array;
   protected Object obj;

    public MyFilter(Object [] array, Object obj){
        this.array = array;
        this.obj = obj;
    }

    public void filter(){
        int offset = 0;
        for (int i=0; i< array.length; i++){
            if (array[i] == obj){
                offset++;
            }
            else {
                array[i - offset] = array[i];
            }

        }

        Object [] newArray = new Object[array.length - offset];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = array[i];
        }

        for (int j = 0; j< newArray.length; j++){
            System.out.println(newArray[j]);
        }

    }


    @Override
    public boolean apply(Object o) {
        return (boolean) o;
    }
}
