package com.telusko;


import java.lang.*;
import java.math.BigInteger;
import java.util.*;

public class Recursion {
    public static BigInteger dev(BigInteger n){
        if(n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        }
        return n.multiply(dev(n.subtract(BigInteger.ONE)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger result = dev(BigInteger.valueOf(n));
        System.out.println(result);
    }
}
