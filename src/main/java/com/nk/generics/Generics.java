package com.nk.generics;

import java.util.*;

public class Generics {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicate(new String[] {"A" , "A" , "C" , "D" , "A"} )));
		
		
	}


	public  static <T>  T[] removeDuplicate(T[] data) {
		Set<T>  set = new LinkedHashSet<T>();

		for ( T t: data ) {
			set.add(t);
		}

		return (T[]) set.toArray();
	}
	
}
