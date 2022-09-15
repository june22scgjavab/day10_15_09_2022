package com.infosys.unchecked.exception3;

public class Demo {
// Though here we are writing the throws clause
// but it is not required because if we dont handle
// in case of unchecked exception, automatically the
// exception is handled by the default handler
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
	
		int num[]= {1,2,3,4};
		System.out.println(num[10]); // So in this
		

	}

}
