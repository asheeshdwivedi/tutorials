package com.data.structures;

import java.util.Iterator;

/**
 * Created by asheeshdwivedi on 1/9/16.
 */
public interface LinkedList<T> {
    boolean isEmpty();

    T get(int pos);

    void addFirst(T item);

    T getFirst();

    T removeFirst();

    void addLast(T item);

    void remove(T item);

    T getLast();

    void insertAfter(T key, T itemToInsert);

    void insertBefore(T key, T itemToInsert);

    void clear();

    Iterator<T> iterator();
}
