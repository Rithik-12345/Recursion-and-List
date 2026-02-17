package com.telusko.Recursion;

import java.util.Scanner;

public class Sumnumbers {
    public static int value(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+value(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = value(n);
        System.out.println(result);
    }
}
