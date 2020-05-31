package com.nk.algo;
import java.util.Arrays;
public class Merge {

    public static void main(String[] args) {
       // merge(new int[]{1, 3, 5 , 7}, new int[]{2, 4, 6});
        //merge(new int[]{1, 3, 5 , 8 }, new int[]{2, 4, 6 , 7});


        int i = -10;
        System.out.println(100>>>1);


    }
    public static void merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int resultCurrentIndex = 0;
        int a2CurrentIndex = 0;
        int a1CurrentIndex = 0;
        for (; (a1CurrentIndex < a1.length  && a2CurrentIndex < a2.length); ) {
            if (a1[a1CurrentIndex] < a2[a2CurrentIndex]) {
                result[resultCurrentIndex] = a1[a1CurrentIndex];
                resultCurrentIndex++;
                a1CurrentIndex++;
            } else {
                result[resultCurrentIndex] = a2[a2CurrentIndex];
                resultCurrentIndex++;
                a2CurrentIndex++;
            }
        }
        if(a1CurrentIndex < a1.length) {
            System.arraycopy(a1 , a1CurrentIndex , result , resultCurrentIndex , a1.length-a1CurrentIndex);
        }
        if(a2CurrentIndex < a2.length) {
            System.arraycopy(a2 , a2CurrentIndex , result , resultCurrentIndex , a2.length-a2CurrentIndex);
        }
        System.out.println(Arrays.toString(result));
    }
}
