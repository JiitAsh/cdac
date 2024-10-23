import java.util.Comparator;

public class Student1 implements Comparator<Student1> {
//	private int rNo;  // int won't work bcz compareTo doesn't work on primitive
	private Integer rNo;
	private String name;
	
	public Student1()   // added bcz to pass "new Student1()" in Collection.sort() in Tester.java class otherwise if don't create default ctor then it will show an error
	{
		
	}
	//ctor 
	public Student1(int rNo, String name) {
		super();
		this.rNo = rNo;
		this.name = name;
	}
	
	
	// getters and setters
	public int getrNo() {
		return rNo;
	}
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	// toString overridden
	@Override
	public String toString() {
		return "Student [rNo=" + rNo + ", name=" + name + "]";
	}

	
	// by rNo 
	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.rNo.compareTo(o2.rNo);
	}
	
	
	// by name
//	@Override
//	public int compare(Student1 o1, Student1 o2) {
//		// TODO Auto-generated method stub
//		return o1.name.compareTo(o2.name);
//	}
	
	
//	// by rNo but if rNo is 'int' not 'Integer'
//	@Override
//	public int compare(Student1 o1, Student1 o2) {
//		// TODO Auto-generated method stub
//		return o1.rNo - o2.rNo;
//	}
	
	
	
	
}
