package com.mindgate.main;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.savings;

public class AccountMainV6 {
	public static void main(String[] args) {
		Account account;
		account = new savings(101, "Test", 3000, false);
		System.out.println(account.withdraw(2000));
	}

}
