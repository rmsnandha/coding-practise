package com.nk.logic;

import java.math.BigInteger;

public class Fibo {

    public static void main(String[] args) {

        System.out.println(fibRecursive(BigInteger.valueOf(100)));


    }


    public static BigInteger fibRecursive(BigInteger number) {

        int i = number.compareTo(BigInteger.valueOf(1));
        if (i <= 0)
            return number;

        BigInteger minus1 = BigInteger.valueOf(-1);
        BigInteger minus2 = BigInteger.valueOf(-2);
        return fibRecursive(number.subtract(minus1)).add(number.subtract(minus2));


    }


}
