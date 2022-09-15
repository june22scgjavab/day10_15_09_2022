package com.infosys.exception.demo1;
/*
 * 
 * Before exception
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.infosys.exception.demo1.Demo1.main(Demo1.java:10)

 */
public class Demo1 {

	public static void main(String[] args) {
	
		int num1=10;
		int num2=0;
		System.out.println("Before exception");
		int result=num1/num2;
		System.out.println("After exception");

	}

}
