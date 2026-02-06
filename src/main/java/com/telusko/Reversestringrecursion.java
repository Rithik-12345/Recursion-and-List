package com.telusko;

import java.lang.*;
import java.util.*;

public class Reversestringrecursion {
    public static void reverse(char[] ch, int start, int end) {
        if (start == end) {
            return;
        }
        else{
            int temp = ch[start];
            ch[start] = ch[end];
            ch[end] = (char) temp;
            reverse(ch,start+1,end-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        reverse(ch,0, ch.length-1);

        String result = new String(ch);
        System.out.println(ch);


    }
}
