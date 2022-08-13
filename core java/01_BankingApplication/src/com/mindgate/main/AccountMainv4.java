package com.mindgate.main;
import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.savings;

public class AccountMainv4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		double amount;
		int choice;
		String continueChoice;
		boolean result;
		boolean isSalary;
		
		
		System.out.println("Enter your accountNumber");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your Name");
		name = scanner.nextLine();
		System.out.println("Enter balance");
		balance = scanner.nextDouble();
		System.out.println("do you want to open salary account (true/false)");
		isSalary = scanner.nextBoolean();
		
		savings account = new savings(accountNumber, name, balance, isSalary);
		System.out.println(account);
		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Balance");
			System.out.println("Enter your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if(result)
					System.out.println("Transaction success!!");
				else
					System.out.println("Transaction failed");
				
				break;
			case 2:
				System.out.println("Enter amount to Deposited");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if(result)
					System.out.println("Transaction success!!");
				else
					System.out.println("Transaction failed");
				
				break;
			case 3:
				System.out.println("Balance ::"+ account.getBalance());
				break;
				

			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue (Yes/No)");
			continueChoice = scanner.next();
		
		} while (continueChoice.equals("Yes"));
		
	}
	
	

}


