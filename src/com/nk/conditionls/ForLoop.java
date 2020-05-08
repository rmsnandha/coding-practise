package com.nk.conditionls;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {

		//funcion1();

		// int a = 10;
		// System.out.println(a);
		// System.out.println(a++);
		// System.out.println(a);
		
		
		/*int[]  i =  {2,  8 , 4, 6 , 8 , 6};
		System.out.println(pair(i).toString() );
*/
		
		char[] input = {'a' , 'b' , 'c'};
	   System.out.println(new String( reverse(input )));
		
	}

	/*
	 * step 1 - Initialization - only once step 2 - condition , step 3 -body
	 * execution step 4 - increment
	 * 
	 * then repeats step 2 onwards
	 */
	public static void funcion1() {

		/*
		 * for (int i = 0; i <= 1; System.out.println("increment")) {
		 * System.out.println("body"); i++; }
		 */

		for (int i = 0; i <= 1; i++) {
			System.out.println("body");

		}

	}

	public static void whileLoop() {

		do {

		} while (1 > 2);

	}

	public static List<String> pair(int[] input) {

		List<String> output = new ArrayList<>();

		// init start index = 0

		// int next = start + 1;

		// start index + next == 10
		// add to collection of start index + next index value
		// increment next = next + 1;
		// continue step 2 till next == lenth

		// increment start index then continue till length -1 = start index

		int start = 0;
		int next = 0;
		do {
			do {
				next = start + 1;


				int x = input[start];
				int y = input[next];
				if (x + y == 10) {
					output.add("{ " + x + ", " + y + "}");
				}
				next = next + 1;

			} while (next != input.length);

			start = start + 1;

		} while (start != input.length - 1);

		return output;
	}
	
	public  static  char[] reverse(char[] input) {

		int lastIndex = input.length - 1;
		char[] output = new char[input.length];
		int begin = 0;

		for (; lastIndex >= 0; lastIndex--) {
			output[begin] = input[lastIndex];
			begin++;
		}

		return output;

	}

}
