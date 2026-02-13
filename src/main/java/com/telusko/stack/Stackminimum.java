package com.telusko.stack;

import java.util.Comparator;
import java.util.Stack;

public class Stackminimum {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.stream().min(Integer::compare).get();
    }

    Comparator<Integer> comparator = (Integer o1, Integer o2) -> {
        return o1.compareTo(o2);
    };
}
