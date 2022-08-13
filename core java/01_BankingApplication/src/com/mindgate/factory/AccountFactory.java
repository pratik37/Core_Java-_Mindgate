package com.mindgate.factory;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.savings;

public class AccountFactory {
	public Account getAccount(int choice) {
		if (choice == 1) {
			return new savings();
		}
		if (choice == 2) {
			return new Current();
			
		}
		return null;
	}

}
