package com.pack1;

public class C extends A {

	public void display()
	{
		//System.out.println(i); // The private members of the Parent class A
		// is not accessible by the subclass C
		System.out.println(j); // as A and C are in same package so 
		// j is accessible as the default members accessibility is 
		// restricted within the same package
		System.out.println(k); // k is a protected member so can be
		// inherited and accessed by the subclass in the same package
		System.out.println(l);// as l is public so it is accessible
		// from class A to C
	}
}
