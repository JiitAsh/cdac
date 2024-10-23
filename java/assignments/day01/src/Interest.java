import java.util.Scanner;
public class Interest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter amount, time(year) and rate(precentage) (space saperated) : ");
		double p = sc.nextDouble();
		int t = sc.nextInt();
		int r = sc.nextInt();
		
		double simpleInterest = (p*r*t)/100;
		System.out.println("Simple Interest is : " + simpleInterest);
		
		sc.close();
	}
}