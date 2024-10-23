package com.cdac;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
public class Printer {
	
	public static int menu(Scanner sc) {
		
		int option=0;
		System.out.println("\n******Choose an option*******");
		System.out.println("1.Create a new account."
				+ "\n2.Check account details."
				+ "\n3.Show all availbale accounts."
				+ "\n4.Delete account."
				+ "\n5.Check Balance."
				+ "\n6.Sort accounts in ascending order(A/c no order)."
				+ "\n7.Sort by account opening date."
				+ "\n0.exit");
		
		System.out.print("Enter option: ");
		option = sc.nextInt();
		sc.nextLine();
		
		
		return option;
		
	}
	
	public static Account createAcc(Scanner sc) {
		System.out.print("\nEnter Name: ");
		String accHoldersName = sc.nextLine();
		
		
		System.out.print("Enter initial amount: ");
		Double initialAmount = sc.nextDouble();
		sc.nextLine();
		
		LocalDate todaysDate = LocalDate.now();
		
		Account acc = new Account(accHoldersName, initialAmount, todaysDate);
		return acc;
	}
	
	
	public static Account checkAcc(Scanner sc,List<Account> accList) {
		System.out.print("Enter A/c no: ");
		Integer accNo = sc.nextInt();
		sc.nextLine();
		for(Account acc:accList) {
			if(accNo.equals(acc.getAccNo())) {
				return acc;
			}
		}
		
		return null;
	}
	
	public static void deleteAcc(Account accToDelete, List<Account> accList) {
		accList.remove(accToDelete);
		System.out.println("Account deleted successfully!!");
	}
	
	
	
	
}
