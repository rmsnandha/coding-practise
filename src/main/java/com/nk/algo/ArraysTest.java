package com.nk.algo;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4}, 3);
    }


    public static void rotate(int[] arr, int numberOfRotate) {

        int temp = arr[0];
        int length = arr.length;
        int currentRotate = 0;
        int lastIndex = length - 1;

         //  time complex O( numberOfRotate * n )
        for (int i = 0; (i < length && currentRotate < numberOfRotate); i++) {

            if (i == lastIndex) {
                arr[i - 1] = arr[i];
                arr[i] = temp;
                i = -1;
                temp =  arr[0];
                currentRotate++;
                continue;
            }
            arr[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
