package day6;
import java.text.ParseException;
import java.util.Scanner;

public class StudentTest {
	
	public static void main(String [] args ) throws ParseException {
		Student[] sarr = new Student[20];
		int choice ;
		int count = 0 ;
		String name ;
		String date ;
		String cource ;
		int marks ;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("1 Add Student ");
			System.out.println("2 Print Student by Roll Number");
			System.out.println("3 Display All Student Details ");
			System.out.println("4 Display All Students Sorted by marks");
			System.out.println("5 Display students sorted by dob");
			System.out.println("0 Exit");
			System.out.println("Enter the choice :");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:{ 
				System.out.println("Enter name : ");
				name = sc.next() ;
				System.out.println("Enter marks : ");
				marks = sc.nextInt() ;
				System.out.println("Enter date of birth : ");
				date = sc.next(); 
				System.out.println("Enter course (DAC, DESD, DVLSI) : ");
				cource = sc.next() ;
				CourseEnum ce = CourseEnum.valueOf(cource) ;
				Student student = new Student(name, marks, Student.getDate(date),ce);
				sarr[count] = student ;
				System.out.println("Student added successfully...");
				System.out.println(sarr[count].toString());
				count++ ;
			}break;
				
			case 2:{
				System.out.println("Enter the rollno : ");
				int rollNo = sc.nextInt() ;
				for(int i=0;i<count;i++) {
					if(rollNo == sarr[i].getRollNo()) {
						System.out.println("Student found successfully....");
						System.out.println(sarr[i].toString());
						break ;
					}
				}
				
			}break;
			
			case 3:{
				for(int i=0;i<count;i++) {
					System.out.println(sarr[i].toString());
				}
				
			}break;
			
			case 4:{
				for(int i=0;i<count;i++) {
					for(int j=0;j<count-1;j++) {
						if(sarr[j].getMarks()>sarr[j+1].getMarks()) {
							Student temp = sarr[j] ;
							sarr[j] = sarr[j+1] ;
							sarr[j+1] = temp ;
						}
					}
				}
				
				System.out.println("After sorting by marks...");
				
				for(int i=0;i<count;i++) {
					System.out.println(sarr[i].toString());
				}
			}break;
			
			case 5:{
				for(int i=0;i<count;i++) {
					for(int j=0;j<count-1;j++) {
						if(sarr[j].getNormalDate().after(sarr[j+1].getNormalDate())){
							Student temp = sarr[j] ;
							sarr[j] = sarr[j+1] ;
							sarr[j+1] = temp ;
						}
					}
				}
				System.out.println("After sorting by Date of birth....");
				for(int i=0;i<count;i++) {
					System.out.println(sarr[i].toString());
				}
			}break ;
			
			case 0:{
				return ;
			}

			default:
				System.out.println("Invalid input....try again...");
			}
			
		}while(choice != 0);
		
		
		sc.close() ;
	}
	

}
