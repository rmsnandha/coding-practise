package com.nk.algo;

import java.util.concurrent.RecursiveTask;

public class Sort {

    public static void main(String[] args) {


        int[]  arr =  new int[]{ 1, 2, 3  , 4 };








    }

    public static void mergesort(int[] arr, int start, int end) {
        if (start < end) {

            int mid = (start + end) / 2;

            mergesort(arr, start, mid);  // sort the first part
            mergesort(arr, mid + 1, end);  // sort the second part

            //Merge.merge(arr,start,mid,end);
        }
    }


    public static class MergeSortTask extends RecursiveTask {
        @Override
        protected Object compute() {
            return null;
        }
    }


    public static int[] sort(int[] input) {

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < input.length - 1; i++) {

                if (input[i] > input[i + 1]) {
                    swap(input, i, i + 1);
                    isSorted = false;
                }

            }

        }

        return input;

    }

    public static void swap(int[] array, int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;

    }
}
