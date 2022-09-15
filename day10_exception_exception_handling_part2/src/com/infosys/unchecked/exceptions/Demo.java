package com.infosys.unchecked.exceptions;

public class Demo {

	public static void main(String[] args) {
		int num[]= {1,2,3,4};
		System.out.println(num[10]); // So in this
		// line we have the probability of getting exception
		// but it is not mandatory to handle as
		// we are not getting any error from the compiler
		// we may or may not handle this exception
		

	}

}
