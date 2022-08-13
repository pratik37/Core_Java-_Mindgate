package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountMainV5 {
public static void main(String[] args) {
	Current current = new Current(101, "pratik" , 10000, 50000);
	System.out.println("Withdraw ::5000");
	current.withdraw(5000);
	
	System.out.println("Balance :"+current.getBalance() + "Overdraft Balance"+ current.getOverdraftBalance());
	System.out.println();
	System.out.println("Withdraw ::15000");
	current.withdraw(15000);
	System.out.println("Balance :"+current.getBalance() + "Overdraft Balance"+ current.getOverdraftBalance());
	System.out.println();
	System.out.println("Deposit : 5000");
	current.deposit(5000);
	System.out.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());

	System.out.println();
	System.out.println("Deposit : 10000");
	current.deposit(10000);
	System.out
			.println("Balance : " + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());	
	
	
}
}
