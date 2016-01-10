package com.data.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by asheeshdwivedi on 1/9/16.
 */
public class SinglyLinkedList<T> implements Iterable<T>,LinkedList<T> {

    private Node<T> head;


    /**
     * @return true if list is empty
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * @param pos get the nth element from list
     * @return nth element from list
     */
    @Override
    public T get(int pos) {
        if (pos < 0 || this.head == null) {
            throw new IndexOutOfBoundsException();
        }
        int index = 0;
        Node<T> temp = head;
        while (temp != null && index < pos) { // Check of the null before to make sure
            // {{pos}} input is not grater then the size of list
            index++;
            temp = temp.next;
        }
        if (temp == null) throw new IndexOutOfBoundsException();
        return temp.data;
    }

    /**
     * @param item add item at the top of Linkedlist
     */
    @Override
    public void addFirst(T item) {
        this.head = new Node<T>(item, this.head);
    }

    /**
     * @return first element from the list
     */
    @Override
    public T getFirst() {
        if (this.head == null) throw new NoSuchElementException();
        return this.head.data;
    }

    /**
     * Remove first element from list
     *
     * @return removed element from the list;
     */
    @Override
    public T removeFirst() {
        T type = getFirst();
        this.head = head.next;
        return type;
    }

    /**
     * @param item add item at the last of list
     */
    @Override
    public void addLast(T item) {
        if (this.head == null) {
            this.addFirst(item);
        } else {
            Node<T> temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<T>(item, null);
        }

    }

    /**
     * Remove first occurrence of the element.
     *
     * @param item
     */
    @Override
    public void remove(T item) {
        if (this.head == null) throw new RuntimeException("Cannot Delete");

        if (this.head.data.equals(item)) {
            this.head = head.next;
            return;
        }
        Node<T> current = this.head;
        Node<T> previous = null;

        while (current != null && current.data.equals(item)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            throw new RuntimeException("Cannot Delete");
        }

        previous.next = current.next;  // Delete the current node;
    }

    /**
     * @return Last elemnt of the list
     */
    @Override
    public T getLast() {
        if (this.head == null) throw new NoSuchElementException();
        Node<T> temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    /**
     * Insert a new node after a node containing the key
     */
    @Override
    public void insertAfter(T key, T itemToInsert) {
        Node<T> temp = head;
        while (temp != null && !temp.data.equals(key)) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.next = new Node<T>(itemToInsert, temp.next);
        } else {
            throw new RuntimeException("Can not insert the item");
        }
    }

    /**
     * @param key
     * @param itemToInsert inserts a new node before a node containing the key.
     */
    @Override
    public void insertBefore(T key, T itemToInsert) {
        if (head == null) {
            throw new RuntimeException("Can not insert the item");
        }
        if (head.data.equals(key)) {
            addFirst(itemToInsert);
            return;
        }

        Node<T> current = head;
        Node<T> privous = null;

        while (current != null && !current.data.equals(key)) {
            privous = current;
            current = current.next;
        }

        if (current != null) {
            privous.next = new Node(itemToInsert, current);
        }
    }

    /**
     * Remove all the nodes from last
     */
    @Override
    public void clear() {
        this.head = null;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private class LinkedListIterator implements Iterator<T> {

        private Node<T> nextNode;

        public LinkedListIterator() {
            this.nextNode = head;  // Assign to head at the initialization of iterator
        }

        @Override
        public boolean hasNext() {
            return nextNode != null; // call this every time to check if it
            // reaches to end because the last element of Linked list point to null
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T data = nextNode.data;
            this.nextNode = nextNode.next; // reassign the nextNode to the very next element of LinkedList
            return data;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
