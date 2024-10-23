import java.util.Scanner;
public class ArithmeticOpes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter operands : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Choose option for operator : \n 1.+\n 2.-\n 3.*\n 4./\n 5.%");
		int operator = sc.nextInt();
		
		int res=0;
		switch(operator){
			case 1:
			System.out.println("Sum is : " + (a+b));
			break;
			case 2:
			System.out.println("Difference is : " + (a-b));
			break;
			case 3:
			System.out.println("Multiplication is : " + (a*b));
			break;
			case 4:
			System.out.println("Division is : " + (a/b));
			break;
			case 5:
			System.out.println("Remainder is : " + (a%b));
			break;
			default:
			System.out.println("Invalid operation!!");
		}
	}
}