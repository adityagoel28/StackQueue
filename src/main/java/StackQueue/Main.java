package StackQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stack Queue Program!");

        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack Operations:");
        while (!stack.isEmpty()) {
            System.out.println("Peak: " + stack.peak());
            System.out.println("Pop: " + stack.pop());
        }
    }
}