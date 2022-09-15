package com.infosys.checked.exceptions;

import java.io.FileInputStream;
// FileNotFoundException is a checked exception
// and is thrown by the constructor of FileInputStream
// We are getting compilation error because we have not
// handled this checked exception
public class Demo {

	public static void main(String[] args) {
		FileInputStream fis=new FileInputStream("d:\\data.txt");

	}

}
