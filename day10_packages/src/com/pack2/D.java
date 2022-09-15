package com.pack2;

import com.pack1.A;

public class D {
public void display() {
	A a=new A();
	//System.out.println(a.i); private member of class A is not accessible
	//System.out.println(a.j); j is not accessible because D is in 
	// different package as that of A
	//System.out.println(a.k); non derived class and in different package
	// wont be able to access the protected member
	System.out.println(a.l);
	// So public member will be accessible from D which is a non-derived
	// class different package
}
}
