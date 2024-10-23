import java.util.Scanner;
public class Delimiter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		int a = sc.nextInt();
		sc.nextLine(); // eater
		System.out.print("Enter : ");
		String s = sc.nextLine();
		
		
		System.out.print(a);
		System.out.print(s);
		
		sc.close();
	}
}