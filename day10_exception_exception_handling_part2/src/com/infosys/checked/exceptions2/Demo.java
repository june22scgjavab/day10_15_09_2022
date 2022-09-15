package com.infosys.checked.exceptions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// FileNotFoundException is a checked exception
// and is thrown by the constructor of FileInputStream
// We are not getting compilation error as we have handled
// exception in the code
// Conclusion : We should handle checked exception while
// writing the code otherwise our code wont compile

public class Demo {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("d:\\data.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
