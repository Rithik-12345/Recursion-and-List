package com.telusko.Recursion;
import java.lang.*;
import java.util.*;

public class Arraysum {
    public static int value(int arr[], int n){
        if(n == 0){
            return arr[0];
        }
        else{
            return arr[n] + value(arr, n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = value(arr, n-1);
        System.out.println(result);
    }
}
