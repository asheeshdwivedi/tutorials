package com.data.structures;

/**
 * Created by asheeshdwivedi on 1/9/16.
 * LinkedList is the best underlying data structure to build the Stack.
 * 1. The most common operation is the stack is push and pop which performs at the top .
 *    and as we know in linkedlist we have a head. which is the first element.
 *
 */
public class Stack<T> {

    private Element<T> top;   // points to the top most element in the stack which can pooped aor peeked at any time.

    /**
     * represent the size of stack and incremented and decremented at every push and pop
     *  so the getSize operation will be O(1) or say constant time
     */
    private int size;


    private final int MAX_SIZE = 40;



    /**
     *
     * @param item
     * @throws StackOverflowException
     *
     * Creates a new element to hold the data and point top to it
     * and increment the size .
     */
    public void push(T item) throws StackOverflowException {
        if(size == MAX_SIZE) throw new StackOverflowException(); //if stack is already full throw the exception
        this.top = new Element<T>(item , top);
        size++;

    }

    /**
     *
     * @return
     * @throws StackUnderflowException
     *
     * Removes the top element and returns its data.
     * and decrement the size
     */

    public T pop() throws StackUnderflowException {
        if(size == 0) throw new StackUnderflowException(); // if stack is empty throw the exception .
        T data = this.top.data;
        this.top = top.next;
        size--;
        return data;
    }

    /**
     *
     * @return
     * @throws StackUnderflowException
     *
     * JUst retrun the data of the top element.
     */
    public T peek() throws StackUnderflowException {
        if(size == 0) throw new StackUnderflowException(); //if stack is empty throw the exception .
        return this.top.data;
    }


    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return MAX_SIZE == size;
    }

    /**
     *
     * @param <T>
     *
     *  Element of the linked list
     */
    private static class Element<T>{
       private T data;                 // which store the data
       private Element<T> next;        // A next pointer which points to next element in the list

        public Element(T data, Element<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public static class StackOverflowException extends Exception {
    }

    public static class StackUnderflowException extends Exception {
    }

}
