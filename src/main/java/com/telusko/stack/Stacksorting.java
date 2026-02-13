package com.telusko.stack;

import java.util.Comparator;
import java.util.Stack;

public class Stacksorting {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(3);
        Comparator<Integer> com = (Integer o1, Integer o2) ->{
                return o1.compareTo(o2);
            };
        stack.sort(com);
        System.out.println(stack);
    }
}
