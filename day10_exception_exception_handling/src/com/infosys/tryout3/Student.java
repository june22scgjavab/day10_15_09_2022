package com.infosys.tryout3;

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
		}
	}
}
/* Current it is handled by the default handler.
 * 
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at com.infosys.tryout.Student.calculateAverageMarks(Student.java:37)
	at com.infosys.tryout.Tester.main(Tester.java:7)




 */
  
