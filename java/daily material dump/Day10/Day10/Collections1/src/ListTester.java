import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListTester {

	public static void main(String[] args) {

		//Collection<E> I/F ->List<E> I/F -> ArrayList<E> CC
		ArrayList<String> stringsList = new ArrayList<String>();
		stringsList.add("Rajesh");
		stringsList.add("Brajesh");
		stringsList.add("Genesh");
		stringsList.add("Dinesh");
		stringsList.add("Ramesh");
		stringsList.add("Suresh");
		stringsList.add("Yogesh");
		stringsList.add("Ritesh");
		stringsList.add("Paresh");
		
		//Get at Index
		String str = stringsList.get(0);
		System.out.println(str);
		//Retrieve
		for(int i = 0 ; i < stringsList.size(); i++) {
			str = stringsList.get(i);
			System.out.println(str);
		}
		
		Scanner sc = new Scanner(System.in);
		
		String strChoice = "Y";
		while(strChoice.equals("Y")) {
			System.out.println(" Please enter name");
			String name = sc.nextLine();
			stringsList.add(name);
			
			System.out.println(" Do you want to add more Y/N");
			strChoice = sc.nextLine();
		}
		
		//Retrieve
		for(int i = 0 ; i < stringsList.size(); i++) {
			str = stringsList.get(i);
			System.out.println(str);
		}
		
		Collections.sort(stringsList);
		System.out.println("After sorting");
		stringsList.forEach(System.out::println);
		sc.close();
		
		//System.out.println(stringsList);
		
		
		
	}

}
