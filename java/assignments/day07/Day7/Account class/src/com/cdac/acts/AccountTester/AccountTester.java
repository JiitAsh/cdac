package com.cdac.acts.AccountTester;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime; 
import com.cdac.acts.Account.Account;
import com.cdac.acts.AccountType.CurrentAccount;
import com.cdac.acts.AccountType.DepositeAccount;
import com.cdac.acts.AccountType.SavingAccount;


public class AccountTester {
		
	public static void main(String[] args) {
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
						Account acc1 = new  SavingAccount(accName, dtf.format(now), ammount);
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
					Account acc2 = new  CurrentAccount(accName, dtf.format(now), ammount);
					System.out.println(acc2);
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
					Account acc3 = new  DepositeAccount(accName, dtf.format(now), ammount);
					System.out.println(acc3);
				}break;
				
				case 4 :
				{
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
