package com.mindgate.main;

import com.mindgate.pojo.Calculation;

public class exceptionmain {

	public static void main(String[] args) {
		System.out.println("Main start");
		Calculation obj =new Calculation();
		obj.accept();
		obj.Calculate();
		obj.display();
		System.out.println("Main Ends");
				

	}

}
