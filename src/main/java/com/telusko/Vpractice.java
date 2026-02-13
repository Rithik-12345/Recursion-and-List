package com.telusko;


import java.util.*;
public class Vpractice {
    public static void main(String args[]){
        Vector v1 = new Vector();
        v1.add("ramesh");
        v1.add("Vikas");
        v1.add("Rahul");
        v1.add("Manoj");

        Vector v2 = new Vector();
        v2.add("Suresh");
        v2.add("Rehman");

        //for(int i = 0; i < v2.size(); i++){  // If we follow this method it will be the waste of performance.
            //v1.add(v2.get(i));
        //}

        v1.addAll(v2);

        System.out.println(v1.size());
        System.out.println(v1.capacity());
    }
}
