package com.nk.logic;

import java.math.BigInteger;

public class Fibo {

    public static void main(String[] args) {

        System.out.println(fibRecursive(BigInteger.valueOf(40)));
        System.out.println(fibRecursive(40));
        System.out.println(forLoop(40));

    }



    public static int fibRecursive(int number) {


        if (number <= 1)
            return number;

        return fibRecursive(number-1) + fibRecursive(number-2);


    }

    public static BigInteger fibRecursive(BigInteger number) {

        //int i = number.compareTo(BigInteger.valueOf(1));
        if (number.compareTo(BigInteger.valueOf(1))<=0)
            return number;

        BigInteger one = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);
        return fibRecursive(number.subtract(one)).
                add(fibRecursive(number.subtract(two)));


    }


    public  static int forLoop(int number) {

        int   beforeBefore = 0;
        int before = 1;


        int current = 0;
        if(number <=1) return number;

         // 0  1  1

        for (int i= 2;  i<=number; i++ ) {
            current = before + beforeBefore;

            beforeBefore = before;
            before = current;
        }
        return   current;

    }


}
