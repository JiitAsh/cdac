import java.util.Scanner;
import java.lang.Math;
public class PatternFour{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=2*n-1;++j){
				if(Math.abs(n-j)<(i-1)) System.out.print("  ");
				else System.out.print("* ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}