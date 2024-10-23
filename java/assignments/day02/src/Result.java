import java.util.Scanner;
public class Result{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks(in percentage) : ");
		float marks=sc.nextFloat();
		int cnt=0;
		while(cnt!=5 && (marks<0 || marks>100)){
			System.out.print("Enter your valid percentage marks : ");
		    marks=sc.nextFloat();
			
			if(cnt==4) System.out.println("You reached maximum limit, please try again letter.");
			
			cnt++;
		}
		
		if(marks>=0 && marks<=100){
			
		if(marks>=75){
			System.out.println("Distinction.");
		}else if(marks>60 && marks<=75){
			System.out.println("First Class.");
		}else if(marks>50 && marks<=60){
			System.out.println("Second Class.");
		}else if(marks>0) {
			System.out.println("Pass.");
		}else{
			System.out.println("Fail");
		}
		}
		
		
		sc.close();
	}
}