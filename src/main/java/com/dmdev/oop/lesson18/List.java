package com.dmdev.oop.lesson18;

public class List<T> {

    private final T[] objects;
    private int size;

    public List(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T object) {
        objects[size++] = object;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}
