package com.pack2;

import com.pack1.A;

public class E extends A {

	public void display() {
		//System.out.println(i); // private member is not inherited
		// by the sub-class in different package
		//System.out.println(j); The default member is not accessible
		// by the subclass as the sub class is in different package
		System.out.println(k); // The protected member is accessible
		// by the derived class/sub class , different package
		System.out.println(l); // as l is public it is accessible from
		// derived class different package
	}
}
