package com.telusko.Recursion;

import java.util.Scanner;

public class Minelerecursion {
    public static int minele(int arr[], int n){
        if(n==0){
            return arr[n];
        }
        else{
            int x = minele(arr,n-1);
            if(arr[n]<x){
                x = arr[n];
            }
            return x;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int x = minele(arr,n-1);
        System.out.println(x);
    }
}
