package com.nk.logic;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class Fibo {


    public static void main(String[] args) {

        Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().map(i-> i * i).sorted().forEach(System.out::println);


        /*


        System.out.println(fibRecursive(BigInteger.valueOf(40)));
        System.out.println(fibRecursive(40));
        System.out.println(forLoop(40));
        System.out.println(streamIterate(40));
*/
    }


    public static int fibRecursive(int number) {


        if (number <= 1)
            return number;

        return fibRecursive(number - 1) + fibRecursive(number - 2);


    }

    public static BigInteger fibRecursive(BigInteger number) {

        //int i = number.compareTo(BigInteger.valueOf(1));
        if (number.compareTo(BigInteger.valueOf(1)) <= 0)
            return number;

        BigInteger one = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);
        return fibRecursive(number.subtract(one)).
                add(fibRecursive(number.subtract(two)));


    }


    public static int forLoop(int number) {

        int beforeBefore = 0;
        int before = 1;


        int current = 0;
        if (number <= 1) return number;

        // 0  1  1

        for (int i = 2; i <= number; i++) {
            current = before + beforeBefore;

            beforeBefore = before;
            before = current;
        }
        return current;

    }


    public static int streamIterate(int number) {

        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[0] + a[1], a[0]})
                .limit(number)
                .forEach(i -> System.out.println(Arrays.toString(i)));

        return 1;

    }


}
