package StackQueue;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T value) { // enqueue() method adds an element to the list
        list.addLast(value);
    }

    public T dequeue() { // dequeue() method removes and returns the first element of the list
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
