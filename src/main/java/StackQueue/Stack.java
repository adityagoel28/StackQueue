package StackQueue;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>(); // LinkedList is a generic class

    public void push(T value) {
        list.addFirst(value); // addFirst() method adds an element to the beginning of the list
    }
}