package com.infosys.exception.demo1;

/*
 * 1. Before exception
   3. I am within catch block
   4. / by zero (exception.getMessage())
   5. After the exception is handled!!!!!
 *
 *  When exception is not thrown
 *  Before exception
    After exception
    5 (This result will vary depending on the values of num1 and num2
    After the exception is handled!!!!!

 *
 */
public class DemoExceptionHandling1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result;
		try {

			System.out.println("Before exception"); // 1
			result = num1 / num2;
			System.out.println("After exception"); // 2 wont be displayed
			System.out.println(result);
		} catch (ArithmeticException exception) {
			System.out.println("I am within catch block");// 3
			System.out.println(exception.getMessage()); // 4

		}
		System.out.println("After the exception is handled!!!!!"); // 5
	}
}
