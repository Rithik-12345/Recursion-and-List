package com.telusko.stack;

import java.util.List;
import java.util.Stack;

public class Stackpractice {
    public static void main(String[] args) {
        // Basically stack follows LIFO concept
        List<String> li = new Stack<String>();
        li.add("Rahul");
        li.add("Manoj");
        li.add("Vikas");
        li.add(0,"Ghana");

        //li.remove(0);
        //li.add(1,"Ramesh");

        li.set(1,"Raghu");

        ((Stack<String>) li).peek();
        System.out.println(li);

        System.out.println(li);
    }
}
