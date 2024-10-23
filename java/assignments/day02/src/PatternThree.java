import java.util.Scanner;
import java.lang.Math;
public class PatternThree{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=2*n-1;i++)
		{
			int stp=2*(Math.abs(n-i)) + 1;
			for(int j=1;j<=2*n-1;++j){
				if(j<=stp) System.out.print("*");
				else System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
		sc.close();
	}
}