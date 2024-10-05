package com.laminformatique.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
    public static void main(String[] args) {
        // TODO . Implémentez une pile en utilisant la classe Stack en Java, LIFO
        /*
         Stack<String> stack = new Stack<>();
        stack.add("Persils");
        stack.add("Pomme de Terre");
        stack.add("Tomates");
        stack.add("Choux");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.push("Salades"));
        System.out.println(stack.peek());
         */

        // TODO . Implémentez une file en utilisant la classe LinkedList en Java, FIFO

        Queue<String> queue = new LinkedList<>();
        queue.add("Persils");
        queue.add("Pomme de Terre");
        queue.add("Tomates");
        queue.add("Choux");
        System.out.println(queue.peek());

    }
}
