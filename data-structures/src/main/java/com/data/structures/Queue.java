package com.data.structures;

import java.lang.reflect.Array;

/**
 * Created by asheeshdwivedi on 1/11/16.
 */
public class Queue<T> {

    private static final int SPACIAL_EMPTY_VALUE = -1;
    private static final int MAX_SIZE = 40;

    private int headIndex = SPACIAL_EMPTY_VALUE;
    private int tailIndex = SPACIAL_EMPTY_VALUE;

    private T[] elements;

    public Queue(){
        elements = (T[])new Object[MAX_SIZE] ;
    }

    public boolean isEmpty(){
        return headIndex == SPACIAL_EMPTY_VALUE;
    }

    /**
     *
     * @return
     * when the head index and tail index are next to each other its either  means
     * queue is full or it has exactly two element .
     * so by calculating the next index of tail and if next tail index is same as head index i.e its full.
     * and mod we are using to wrap around if tail pointing to last index of array.
     */
    public boolean isFull(){
        int nextIndex = (tailIndex + 1)% elements.length;

        return nextIndex == headIndex;
    }

    /**
     *
     * @param item
     * @throws QueueOverflowException
     * Adding a new element to the end of the queue
     * only tail moves on enqueue head stays same.
     */
    public void enqueue(T item) throws QueueOverflowException{
        if(isFull()) throw new QueueOverflowException();

        tailIndex = (tailIndex + 1)% elements.length;

        elements[tailIndex] = item;

        if(headIndex == SPACIAL_EMPTY_VALUE){
            headIndex = tailIndex;
        }
    }

    /**
     *
     * @return
     * @throws QueueUnderflowException
     * Removing an element from the beginning of a queue
     * only head moves tails stays put.
     */
    public T dequeue() throws QueueUnderflowException{

        if(isEmpty()) throw new QueueUnderflowException();

        T data = elements[headIndex];

        if(headIndex == tailIndex){
            headIndex = SPACIAL_EMPTY_VALUE;
        }else{
            headIndex = (headIndex+1) % elements.length;
        }
        return data;
    }

    public static class QueueOverflowException extends Exception {
    }

    public static class QueueUnderflowException extends Exception {
    }

}
