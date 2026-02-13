package com.telusko.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylistinsert {
    public static void main(String[] args) {
        Integer[] arr = {8,5,1,9};
        List<Integer> li = new ArrayList<>(Arrays.asList(arr));
        li.add(12);
        li.add(16);

        System.out.println(li);
    }
}
