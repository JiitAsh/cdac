package com.cdac.comparators;

import java.util.Comparator;

import com.cdac.Account;

public class AccNoComparator implements Comparator<Account> {
	@Override
	public int compare(Account acc1, Account acc2) {
		return acc1.getAccNo().compareTo(acc2.getAccNo());
	}
}
