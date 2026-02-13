package com.telusko.stack;

import java.util.Stack;

public class Stackreverse {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        String val = stack.reversed().toString();
        System.out.println(val);
    }
}
