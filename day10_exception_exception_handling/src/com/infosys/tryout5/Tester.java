package com.infosys.tryout5;
public class Tester {
	public static void main(String[] args) {
		Student student1 = new Student();
		int[] marks = { 96, 65, 76 };
		student1.setMarks(marks);
		try
		{
		student1.calculateAverageMarks();
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
		}
		}
}
