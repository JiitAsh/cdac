import java.util.Scanner;
public class FourDigits{
	
	public static int digitSumFun(int num){
		if(num==0) return 0;
		
		return num%10 + digitSumFun(num/10);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a 4 digit number : ");
		int num = sc.nextInt();
		int digitSum=0;
		int temp=num;   // so that original value remain same
		
		while(temp!=0){
			digitSum += temp%10;
			temp /= 10;
		}
		
		System.out.println("Digit sum is(using loop) : " + digitSum);
		
		digitSum = 0; 
		digitSum = digitSumFun(num);
		
		System.out.println("Digit sum is(using recursion) : " + digitSum);
		
		sc.close();
	}
}