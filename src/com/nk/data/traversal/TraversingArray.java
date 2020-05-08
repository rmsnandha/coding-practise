package com.nk.data.traversal;

public class TraversingArray {

	public static void main(String[] args) {

		// traverseBothEnd();
		System.out.println(factorial(5) );

	}

	public static void traverseBothEnd() {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int mid = array.length / 2;
		int lastIndex = array.length - 1;

		for (int i = 0; i <= mid - 1; i++) {
			System.out.println("index :" + i + " = " + array[i]);
			System.out.println("index :" + lastIndex + " = " + array[lastIndex]);
			lastIndex--;
		}

	}

	// factorial example

	public static int factorial(int input) {

		// 1 * 2 * 3 * 4 * 5 =

		if (input <= 1)
			return 1;
		else
			return factorial(input - 1) * input;
		
		 

	}

	/*
	 * start at index 0 then move forward for to 2 step then backward for 1 step,
	 * find balance left which not touched
	 */
	
	
	
	public  static void  traverse() {
		int[]  array =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		
		int  lastIndex = array.length -1;
		int  traverseTill =  lastIndex -  2;
		
		
		
		for(int i=0;  i <=traverseTill; i++) {
			
		}
		
		
		
		
		
		
	}

}