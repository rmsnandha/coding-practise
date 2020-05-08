package com.nk.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	public static void main(String[] args) {
		
		
		
		List<Number>  a =  new ArrayList<>();
		
		
		
		a.add(1);
		a.add(2.2f);
		
		
		for (Number number : a) {
			System.out.println(number);
		}
		
		
	}
	
}
