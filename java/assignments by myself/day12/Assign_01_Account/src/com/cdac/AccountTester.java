package com.cdac;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.time.LocalDate;
import java.util.Scanner;
import com.cdac.comparators.AccNoComparator;
import com.cdac.comparators.DopComparator;
public class AccountTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Programmer :)");
		List<Account> accList = new LinkedList<>();
		Account ac1 = new Account("Jitesh",10000.0,LocalDate.now());
		Account ac2 = new Account("Nitesh",14000.0,LocalDate.now());
		Account ac3 = new Account("Ritesh",12000.0,LocalDate.now());
		accList.add(ac1);
		accList.add(ac2);
		accList.add(ac3);
		
		
		
		
		int option;
		do {
			option = Printer.menu(sc);
			switch(option) {
			case 1:{
				Account accCreate = Printer.createAcc(sc);
				accList.add(accCreate);
				System.out.println("Account created successfully!!!");
				System.out.println("Your A/c No is: " + accCreate.getAccNo().toString());
			}break;
			
			case 2:{
				Account checkAcc = Printer.checkAcc(sc,accList);
				if(null==checkAcc) {
					System.out.println("Account Not Found!!");
					break;
				}
				System.out.println(checkAcc.toString());
				
				
			}break;
			
			case 3:{
				System.out.println("\n*****Available Accounts are*****");
				for(Account acc:accList) {
					System.out.println(acc);
				}
			}break;
			
			case 4:{
				Account checkAcc = Printer.checkAcc(sc, accList);
				if(null==checkAcc) {
					System.out.println("Account Not Found!!");
					break;
				}
				
				Printer.deleteAcc(checkAcc, accList);
				
			}break;
			
			case 5:{
				System.out.println(":)");
			}break;
			
			case 6:{
				
				Collections.sort(accList,new AccNoComparator());
				for(Account acc:accList) {
					System.out.println(acc);
				}
			}break;
			
			case 7:{
				Collections.sort(accList,new DopComparator());
				for(Account acc:accList) {
					System.out.println(acc);
				}
			}break;
			
			case 0:{
				System.out.println("Have a nice day :)");
			}
			
			}
			
		}while(option!=0);
		
		sc.close();
	}

}
