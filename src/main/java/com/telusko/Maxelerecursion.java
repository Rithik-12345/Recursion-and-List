package com.telusko;

import java.lang.*;
import java.util.*;

public class Maxelerecursion {
    public static int maxele(int arr[], int n){
        if(n == 0){
            return arr[0];
        }
        else{

            int x = maxele(arr,n-1);
            if(arr[n]>x){
                x = arr[n];
            }
            return x;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = maxele(arr,n-1);
        System.out.println(result);
    }
}
