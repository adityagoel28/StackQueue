package StackQueue;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T value) {
        list.addLast(value);
    }

    public int size() {
        return list.size();
    }
}