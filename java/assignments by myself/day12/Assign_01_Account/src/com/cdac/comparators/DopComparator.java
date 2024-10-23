package com.cdac.comparators;

import java.util.Comparator;

import com.cdac.Account;

public class DopComparator implements Comparator<Account> {
	@Override 
	public int compare(Account acc1, Account acc2) {
		return acc1.getDateOfOpening().compareTo(acc2.getDateOfOpening());
	}
}
