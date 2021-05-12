package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorForDoubleRowArray<T> implements Iterator<T> {
    private T[][] arr;
    private int i, j;

    public IteratorForDoubleRowArray(T[][] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return i < arr.length && j < arr[i].length;
    }

    @Override
    public T next() {
        T r = arr[i][j++];
        if (j >= arr[i].length) {
            i++;
            j = 0;
        }
        return r;
    }
}