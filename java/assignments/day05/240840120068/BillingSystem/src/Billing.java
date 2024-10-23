package com.cmart;
import com.cmart.Customer;
import com.cmart.Item;
import java.util.Scanner;
public class Billing{
	public static double generateBill(Customer cstmr, int totalItemPurchased, Item items[], int totalItemPresent){
		double totalAmount = 0;
		for(int i=0;i<totalItemPurchased;i++){
			int purchasedItemCode = cstmr.getItemCode(i);
			int purchasedItemQuantity = cstmr.getQuantity(i);
			
			double itemPrice=0;
			for(int j=0;j<totalItemPresent;j++){
				if(items[j].itemCode == purchasedItemCode){
					itemPrice = items[j].price;
				}
			}
			
			totalAmount += (itemPrice*purchasedItemQuantity);
		}
		
		return totalAmount;
	}
	public static void main(String ...args){
		Scanner sc = new Scanner(System.in);
		Item items[] = new Item[10];
		int option;
		int cnt=0;
		do{
			System.out.println("Press 1 ot add item \nPress 0 to exit");
			
			option = sc.nextInt();
			sc.nextLine();
			
			if(option==1){
				System.out.print("Enter item name: ");
				String itemName = sc.nextLine();
				System.out.print("Enter item price: ");
				double itemPrice = sc.nextDouble();
				System.out.print("Enter quantity: ");
				int itemQuantity = sc.nextInt();
				Item item = new Item();
				item.addItem(itemName,itemPrice,itemQuantity);
				items[cnt] = item;
			}
			cnt++;
		}while(option!=0 && cnt!=10);
			
		int totalItemPresent=0;
		if(cnt==10){
			totalItemPresent=cnt;
		}
		totalItemPresent=cnt-1;
			
		Customer cstmr = new Customer();

		cnt=0;
		option=0;
		int itemCode;
		int quantity;
		do{
			System.out.println("Press 1 to see available items \nPress 0 for billing");
			option = sc.nextInt();
			
			if(option == 1){
				// show the list 
				for(int i=0;i<totalItemPresent;i++){
					System.out.println(items[i].getItemDetails());
				}
				
				System.out.print("Enter itemCode and quantity(space saperated): ");
				itemCode = sc.nextInt();
				quantity = sc.nextInt();
				cstmr.putItem(itemCode,quantity);
				
				cnt++;
			}
			
		}while(option!=0 && cnt!=10);
		
		int totalItemPurchased = cnt;
		
		// generate bill
		double totalAmount = generateBill(cstmr,totalItemPurchased, items, totalItemPresent);
		
		
		System.out.println(totalAmount);
		
		
		sc.close();
	}
}