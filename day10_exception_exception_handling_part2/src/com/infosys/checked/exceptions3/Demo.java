package com.infosys.checked.exceptions3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// FileNotFoundException is a checked exception
// and is thrown by the constructor of FileInputStream
// We are not getting compilation error as in the below
// code we have not handled the exception but we have
// thrown the exception so that the caller of main ( which is JVM)
// will handle the exception
public class Demo {

	public static void main(String[] args) throws FileNotFoundException   {
		
			FileInputStream fis=new FileInputStream("d:\\data.txt");
		
	}

}
