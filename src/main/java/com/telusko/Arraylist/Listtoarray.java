package com.telusko.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listtoarray {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        System.out.println(li);

        Integer[] arr = li.toArray(new Integer[10]);
        System.out.println(Arrays.toString(arr));
    }
}
