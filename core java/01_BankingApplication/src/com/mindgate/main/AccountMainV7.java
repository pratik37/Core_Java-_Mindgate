package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.AccountFactory;
import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.savings;

public class AccountMainV7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AccountFactory accountFactory = new AccountFactory();
		int choice;
		System.out.println("press 1. Savings");
		System.out.println("Press 2. Current");
		System.out.println("Enter your Choice");
		choice = scanner.nextInt();
		Account account = accountFactory.getAccount(choice);
		if (account instanceof savings)
			System.out.println("Savings object Created!!");
		if(account instanceof Current)
			System.out.println("Current Object Created!!");
			
		
		
	}

}
