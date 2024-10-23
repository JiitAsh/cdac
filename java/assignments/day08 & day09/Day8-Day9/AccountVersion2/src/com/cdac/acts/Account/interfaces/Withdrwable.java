package com.cdac.acts.Account.interfaces;

import com.cdac.acts.Account.exception.MinBalnceException;

public interface Withdrwable {
	public double withdraw( double amount) throws MinBalnceException;
}