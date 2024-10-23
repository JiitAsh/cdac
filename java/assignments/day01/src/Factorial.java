import java.util.Scanner;
public class Factorial{
	private static int fact(int n){
		if(n==1){
			System.out.print(1 + " ");
			return 1;
		}
		
		int r=fact(n-1);
		System.out.print(n*r + " ");
		return n*r;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		fact(n);
		sc.close();
	}
}