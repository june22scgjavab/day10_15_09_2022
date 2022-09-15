package com.infosys.unchecked.exceptions2;

public class Demo {

	public static void main(String[] args) {
		try
		{
		int num[]= {1,2,3,4};
		System.out.println(num[10]); // So in this
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
