package com.telusko.Recursion;

import java.util.Scanner;

public class Oneton {
    public static void value(int n){
        if(n==0){
            return;
        }
        else{
            value(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        value(n);
    }
}
