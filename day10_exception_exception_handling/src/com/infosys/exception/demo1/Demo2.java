package com.infosys.exception.demo1;
/*
 * 
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
 */

public class Demo2 {

	public static void main(String[] args) {
		int array[]= {1,2,3};
		
		for(int i=0;i<=array.length;i++)
		{
			System.out.println(array[i]);
		}

	}

}
