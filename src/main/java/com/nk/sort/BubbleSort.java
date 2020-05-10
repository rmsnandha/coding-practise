package com.nk.sort;

import java.util.stream.IntStream;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 9,8,7,6,5,4,3,2,1,0 };

		// int position = length - 2;

		// while (position <=0 )

		// start at index n = 0 till position
		// compare with n + 1
		// if n greater than n + 1 then swap

		// position --;
		
		
	IntStream.of(sort(array)).forEach(System.out::print);

	}

	public static int[] sort(int[] input) {

		boolean isSorted = false;

		while (!isSorted) {
			isSorted =  true;

			for (int i = 0; i < input.length - 1; i++) {
				
				if(input[i] > input[i+1]) {
					swap(input, i, i+1);
					isSorted =  false;
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
