package com.telusko.stack;

import java.util.Stack;

public class Stringtostack {
    public static void main(String[] args) {
        String str = "when";
        char[] str1 = str.toCharArray();

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str1.length; i++) {
             stack.push(str1[i]);
        }
        System.out.println(stack);
    }
}
