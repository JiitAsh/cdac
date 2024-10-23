import java.util.Scanner;
public class Mobile{
	
	public static void numberFormatter(StringBuilder num){		
		if(num.length()==16){
			System.out.println("Your number is : " + num);
		}
		else{
			if(num.length()==10) {
				num.replace(0, 0, "+91");
			}
			num.replace(3, 3, "-");
			num.replace(7, 7, "-");
			num.replace(11, 11, "-");
			
			
			System.out.println("Your number is : " + num);
		}
	}
	
	
	
	
	public static void main(String ...args){
		Scanner sc = new Scanner(System.in);
		String str = new String();
		
		
		do{
			
		System.out.print("Enter your number : ");
		str = sc.nextLine();
		
		if(str.length()<10){
			System.out.println("Please enter a valid number!!");
		}
		}while(str.length()<10);
		
		
		StringBuilder num = new StringBuilder(str);
		numberFormatter(num);
		sc.close();
	}
}