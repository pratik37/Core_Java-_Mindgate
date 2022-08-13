package com.mindgate.pojo;

public class Current extends Account {
	 private double OverdraftBalance;
	 private double initialOverdraftBalance;
	 
	 public Current() {
		 
	 }
	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.OverdraftBalance = overdraftBalance;
		initialOverdraftBalance = overdraftBalance;
		
	} 
	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() -  amount);
			return true;
			
		}
		if (amount > 0 && amount > getBalance() && amount < getBalance() + OverdraftBalance) {
			amount = amount - getBalance();
			setBalance(0);
			OverdraftBalance = OverdraftBalance - amount;
			return true;
			
		}
		
		setBalance(getBalance() - amount);
		
		
		return false;
	}
	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if (OverdraftBalance < initialOverdraftBalance) {
				double difference = initialOverdraftBalance - OverdraftBalance;
				if (difference < amount) {
					amount = amount - difference;
					OverdraftBalance = initialOverdraftBalance;
					setBalance(getBalance() + amount);
					return true;
					
				}
				
			 else {
				 OverdraftBalance = OverdraftBalance + amount;
				 return true;
			 }

			}
			
		 else {
			 setBalance(getBalance() + amount);
			 return true;
		 }

		}
		
		
		return false;
		
	}
	public double getOverdraftBalance() {
		return OverdraftBalance;
	}
	public void setOverdraftBalance(double overdraftBalance) {
				OverdraftBalance = overdraftBalance;
	}
	
	
	 

}
