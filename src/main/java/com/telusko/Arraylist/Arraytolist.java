package com.telusko.Arraylist;

import java.util.Arrays;
import java.util.List;

public class Arraytolist {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,40};

        List<Integer> list = Arrays.asList(arr);

        System.out.println(list);
    }
}
