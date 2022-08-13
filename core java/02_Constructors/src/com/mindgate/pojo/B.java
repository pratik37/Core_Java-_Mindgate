package com.mindgate.pojo;

public class B extends A {
public B() {
	System.out.println("Default Constructor of B");
}
public B(int x) {
	super(x);
	  System.out.println("Parameterized Constructor of B");
}
}
