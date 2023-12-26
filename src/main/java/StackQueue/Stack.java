package StackQueue;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>(); // LinkedList is a generic class

    public void push(T value) {
        list.addFirst(value); // addFirst() method adds an element to the beginning of the list
    }

    public T peak() {
        return list.peekFirst(); // peekFirst() method returns the first element of the list
    }

    public T pop() {
        return list.removeFirst(); // removeFirst() method removes and returns the first element of the list
    }

    public boolean isEmpty() {
        return list.isEmpty(); // isEmpty() method returns true if the list is empty
    }

    public int size() {
        return list.size(); // size() method returns the size of the list
    }
}
