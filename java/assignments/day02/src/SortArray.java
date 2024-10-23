import java.util.Scanner;
public class SortArray{
	
	private static void sortArray(int[] arr){
		for(int i=0;i<9;i++){
			for(int j=i+1;j<10;++j){
				if(arr[j]<=arr[i]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	private static void display(int[] arr){
		for(int i=0;i<10;++i){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("Enter 10 numbers(space saperated) : ");
		for(int i=0;i<10;++i){
			arr[i] = sc.nextInt();
		}
		sortArray(arr);
		display(arr);
		
		
		sc.close();
	}
}