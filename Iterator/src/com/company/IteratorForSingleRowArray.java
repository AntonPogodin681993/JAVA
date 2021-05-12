package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorForSingleRowArray<T> implements Iterator<T> {
    public T[] array;
    public int index = 0;

    public IteratorForSingleRowArray(T [] array) {
        this.array = array;
    }


    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
       if(!hasNext())
            throw new NoSuchElementException();
        return array[index++];
    }
}
