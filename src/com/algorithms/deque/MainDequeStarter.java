package com.algorithms.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MainDequeStarter {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        //Deque<String> deque = new LinkedList<>();
        deque.add("Игорь");
        deque.add("Саша");
        deque.add("Катя");
        deque.add("Миша");

        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
