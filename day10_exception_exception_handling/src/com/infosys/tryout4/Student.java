package com.infosys.tryout4;

public class Student {
	private String name;
	private int[] marks;
	private float averageMarks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public float getAverageMarks() {
		return averageMarks;
	}

	public void setAverageMarks(float averageMarks) {
		this.averageMarks = averageMarks;
	}

	public void calculateAverageMarks() {
		int sum = 0;
		int totalSubjects = 0;
		try {
			for (int i = 0; i <= marks.length; i++) {
				sum += marks[i]; // sum=sum+marks[i];
			}
			this.averageMarks = sum / totalSubjects;// Calculating averageMarks
			System.out.println("Average Marks : " + this.averageMarks);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
