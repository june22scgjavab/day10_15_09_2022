package com.infosys.exception.throwdemo;

import java.util.Scanner;
// Exception is a checked exception 
// we need to handle or we can propogate by writing
// throws clause
// In the below example the thrown exception
// is handled by the default handler
public class EmployeeMain {

	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		Employee employee=new Employee();
		int id;
		String name;
		System.out.println("Enter the id");
		id=scanner.nextInt();
		
		if(id<=0) {
			throw new Exception("Id cannot in negative or 0");
					
		}
		System.out.println(id);
		employee.setId(id);
		

	}

}
