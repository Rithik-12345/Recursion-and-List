package com.telusko.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(6);
        list.add(1);

        Collections.sort(list);
        //Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
