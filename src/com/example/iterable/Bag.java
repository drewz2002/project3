package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {

    ArrayList<T> bag;

    public Bag() {
        bag = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public void add(T item) {
        bag.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return bag.iterator();
    }

    //extra credit
    @Override
    public void forEach(Consumer<? super T> action) {
        bag.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return bag.spliterator();
    }
}
