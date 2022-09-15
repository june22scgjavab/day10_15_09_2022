package com.infosys.tryout2;
public class Tester {
	public static void main(String[] args) {
		Student student1 = new Student();
		int[] marks = { 96, 65, 76 };
		student1.setMarks(marks);
		student1.calculateAverageMarks();
	}
}
