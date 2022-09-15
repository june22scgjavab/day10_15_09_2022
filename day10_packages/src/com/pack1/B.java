package com.pack1;
/*
 * Only private member is not accessible by the class 
 * which is in the same package and non-derived class
 */
public class B {

	public void display()
	{
		A a=new A();
		//System.out.println(a.i); // i is a private member of class
		// A so it is not accessible from the class B
	    System.out.println(a.j); // j is a default/package specific member of
	    // class A so it is accessible from class B after creating
	    // an object class A
	    System.out.println(a.k); // protected members are also 
	    // accessible by the non-derived class , if the class in the 
	    // same package
	    System.out.println(a.l); // public members are accessible for 
	    // class A to class B
	}
}
