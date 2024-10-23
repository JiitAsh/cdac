package com.cdac.acts.AccountTester;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime; 
import com.cdac.acts.Account.Account;
import com.cdac.acts.Account.exception.MinBalnceException;
import com.cdac.acts.AccountType.CurrentAccount;
import com.cdac.acts.AccountType.DepositeAccount;
import com.cdac.acts.AccountType.SavingAccount;


public class AccountTester {
		
	public static void main(String[] args) throws MinBalnceException {
			Scanner sc = new Scanner(System.in);
			System.out.println("*******Bank Account Structer*******");
			do {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			    LocalDateTime now = LocalDateTime.now(); 
				System.out.println("******MENU******");
				System.out.println("1. Saving Account ");
				System.out.println("2. Current Account ");
				System.out.println("3. Deposite Account ");
				System.out.println("4. exit ");
				System.out.println("Enter Your choice");
				int choice = sc.nextInt();
				switch( choice ) {
						
				case 1 :
					{
						sc.nextLine();
						System.out.println("Enter the Account Holder Name");
						String accName = sc.nextLine();
/*						System.out.println("Enter the Date of Joining");
						String DoJ = sc.nextLine();*/
						System.out.println("Enter the amount");
						double ammount = sc.nextDouble();
						SavingAccount acc1 = new  SavingAccount(accName, dtf.format(now), ammount);
						System.out.println(acc1);
						System.out.println("1. Deposit");
						System.out.println("2. Withdraw");
						System.out.println("3. Main Menu");
						System.out.println("Enter your choice: ");
						int ch = sc.nextInt();
						if(ch == 1) {
						System.out.println("Enter Amount to deposite: ");
						double amount = sc.nextDouble();
						acc1.deposite(amount);
						}else if(ch == 2) {
							System.out.println("Enter Amount to Withdraw: ");
							double amount1 = sc.nextDouble();
							acc1.withdraw(amount1);
						}else if(ch == 3) {
							break;
						}else {
							System.out.println("Please Enter Valid choice");
						}
						System.out.println("Your current Balance is");
						System.out.println(acc1.getBalance());
						System.out.println(acc1);
					}break;
					
				case 2 :
				{
					sc.nextLine();
					System.out.println("Enter the Account Holder Name");
					String accName = sc.nextLine();
					//sc.nextLine();
/*					System.out.println("Enter the Date of Joining");
					String DoJ = sc.nextLine();*/
					System.out.println("Enter the amount");
					double ammount = sc.nextDouble();
					CurrentAccount acc2 = new  CurrentAccount(accName, dtf.format(now), ammount);
					System.out.println(acc2);
					System.out.println("1. Deposit");
					System.out.println("2. Withdraw");
					System.out.println("3. Main Menu");
					System.out.println("Enter your choice: ");
					int ch = sc.nextInt();
					if(ch == 1) {
					System.out.println("Enter Amount to deposite: ");
					double amount = sc.nextDouble();
					acc2.deposite(amount);
					}else if(ch == 2) {
						System.out.println("Enter Amount to Withdraw: ");
						double amount1 = sc.nextDouble();
						acc2.withdraw(amount1);
					}else if(ch == 3) {
						break;
					}else {
						System.out.println("Please Enter Valid choice");
					}
					System.out.println("Your current Balance is");
					System.out.println(acc2.getBalance());
					
				}break;
				
				case 3 :
				{
					sc.nextLine();
					System.out.println("Enter the Account Holder Name");
					String accName = sc.nextLine();
					//sc.nextLine(); 
					/*System.out.println("Enter the Date of Joining");
					String DoJ = sc.nextLine();*/
					System.out.println("Enter the amount");
					double ammount = sc.nextDouble();
					DepositeAccount acc3 = new  DepositeAccount(accName, dtf.format(now), ammount);
					System.out.println(acc3);
					System.out.println("If You want to calculate maturity amount press 1 else press 2: ");
					int ch1 = sc.nextInt();
					if(ch1 == 1) {
					System.out.println("Enter the time to calculate maturity amount on your Account Balance: ");
					int time = sc.nextInt();
					System.out.println(acc3.calculateMatutyAmount(time));
					}
					
				}break;
				
				case 4 :
				{
					sc.close();
					System.exit(0);
				}break;
				
				default :
				{
					System.out.println("Please Enter Valid Choice!!!!!");
				}
			}		
		}while(true);
			
		}

}
