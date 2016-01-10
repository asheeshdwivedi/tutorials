package com.data.structures.search;

import com.data.structures.LinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by asheeshdwivedi on 1/9/16.
 */
public class DoublyLinkedList<T> implements Iterable<T>,LinkedList<T> {

    private Node<T> head;


    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    @Override
    public void addFirst(T item) {
        head = new Node<>(item , this.head , null);
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T get(int pos) {
        if(pos < 0){
            throw  new IndexOutOfBoundsException();
        }
        int index =0;
        Node<T> temp = head;
        while(temp != null && index < pos ){
            temp = temp.next;
            index++;
        }
        if(temp==null){
            throw  new IndexOutOfBoundsException();
        }
        return temp.data;
    }

    @Override
    public T getFirst() {
        if(head==null){
            throw new NoSuchElementException();
        }
        return head.data;
    }

    @Override
    public T removeFirst() {
        T t = getFirst();
        head = head.next;
        return t;
    }

    @Override
    public void remove(T item) {
        if(head==null) throw new RuntimeException("Cannot delete");
        if(this.head.data.equals(item)){
            this.head = this.head.next;
        }else{
            Node<T> current = this.head;
            Node<T> previous = null;
            while(current!=null && current.data.equals(item)){
                previous = current;
                current = current.next;
            }
            if(current==null){
                throw new RuntimeException("Cannot delete");
            }
            previous.next = current.next;
            previous.previous = previous;
        }
    }

    @Override
    public void addLast(T item) {
       if(head == null){
           head = new Node(item , null , null);
       }else{
           Node<T> temp = head;
           while(temp.next != null){
               temp = temp.next;
           }
           temp.next =  new Node(item , null , temp);
       }
    }

    @Override
    public T getLast() {
        if(head==null) new NoSuchElementException();
        Node<T> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public void insertAfter(T key, T itemToInsert) {
      Node<T> temp = this.head;
      while(temp !=null && !temp.data.equals(key)){
          temp = temp.next;
      }
      if(temp != null){
          temp.next = new Node<T>(itemToInsert , temp.next , temp);
      }
    }

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
            privous.next = new Node(itemToInsert, current , privous);
        }
    }

    @Override
    public void clear() {
        this.head = null;
    }
    private static class Node<T>{

        private T data;
        private Node<T> next;
        private Node<T> previous;

        public Node(T data, Node<T> next, Node<T> previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
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
