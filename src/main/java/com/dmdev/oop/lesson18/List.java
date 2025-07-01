package com.dmdev.oop.lesson18;

import java.util.Iterator;

public class List<T> implements Iterable<T> {

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

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }

        @Override
        public void remove() {
            if (currentIndex == 0) {
                throw new IllegalStateException("next() не был вызван");
            }
            int removeIndex = --currentIndex;
            System.arraycopy(objects, removeIndex + 1, objects, removeIndex, size - removeIndex - 1);
            objects[--size] = null;
        }
    }
}
