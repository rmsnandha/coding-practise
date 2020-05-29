package com.nk.algo;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        twoSum(new int[]{2, 3, 9, 5, 1, 6}, 7);
        System.out.println( twoSumExist(new int[]{2, 3, 9, 5, 1, 6}, 5) );
    }


    //  2, 3, 9, 5
    public static void twoSum(int[] arr, int target) {
        List<Integer[]> list = new ArrayList<>();

        for (int i = 0; i <= arr.length - 2; i++) {

            for (int j = i + 1; j <= arr.length - 1; j++) {

                if (arr[i] + arr[j] == target) {
                    list.add(new Integer[]{i, j});
                }
            }

        }

        list.forEach(a -> System.out.printf("[%d %d]", a[0], a[1]));
    }


    // 2, 3, 4  ->  6
    public static boolean twoSumExist(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {

            //  a +  n =   target
            int a = target - n;
            if (map.containsKey(a)) {
                return true;
            } else {
                map.put(n, n);
            }

        }

        return  false;

    }

}
