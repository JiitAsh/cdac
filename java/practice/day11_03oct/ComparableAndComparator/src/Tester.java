import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester {
	public static void main(String...args) {
		
		/*  *************  FOR COMPARABLE TESTING (USE "Student" CLASS)   ********************
		 
//		Student s1 = new Student(123,"Jitesh");
//		Student s2 = new Student(452,"Ramesh");
//		Student s3 = new Student(125,"Vaishnavi");
//		
//		System.out.println(s1.toString());
//		
//		List<Student> sl = new ArrayList<> ();
//		sl.add(s1);
//		sl.add(s2);
//		sl.add(s3);
//		// print direct using sysout
//		System.out.println(sl);
//		
//		//enhanced for loop
//		for(Student std : sl) {
//			System.out.println(std.toString());
//		}
//		
//		
//		Collections.sort(sl);
//		
//		System.out.println();
//		System.out.println("After Sorting");
//		//enhanced for loop
//		for(Student std : sl) {
//		System.out.println(std.toString());
//		}
 * */

		
		/* ******************  FOR TESTING COMPARATOR (USE "Student1" CLASS) *************/
		Student1 s1 = new Student1(123,"Ramesh");
		Student1 s2 = new Student1(452,"Jitesh");
		Student1 s3 = new Student1(125,"Vaishnavi");
		
		System.out.println(s1.toString());
		
		List<Student1> sl = new ArrayList<> ();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		// print direct using sysout
		System.out.println(sl);
		
		//enhanced for loop
		for(Student1 std : sl) {
			System.out.println(std.toString());
		}
		
		
		//Collections.sort(sl); // will show error
		Collections.sort(sl, new Student1());
		
		System.out.println();
		System.out.println("After Sorting");
		//enhanced for loop
		for(Student1 std : sl) {
		System.out.println(std.toString());
		}
//		**/
		
	}
}
