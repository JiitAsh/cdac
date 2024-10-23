package com.bank;

public class Tester {

	public static void main(String[] args) {
		Account ac = new Account();
//		ac.setBalace(12000);
		ac.setBalace(300);
		try {
			if(ac.getBalance()<10000) {
				throw new BalanceException("Account Balance is Low!!");
			}
		}catch(BalanceException be) {
			System.out.println(be);
		}finally {
			System.out.println("ok bye bye!!");
		}
	}

}