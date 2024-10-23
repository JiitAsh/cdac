
public class Student implements Comparable<Student> {
//	private int rNo;  // int won't work bcz compareTo doesn't work on primitive
	private Integer rNo;
	private String name;
	
	//ctor 
	public Student(int rNo, String name) {
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
	
//	// Comparable's comareTo() method implementation for rNo
// 	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.rNo.compareTo(o.rNo);  // in this line the compareTo() method is from Integer class not it is calling it self
//	}
	
	
 	// Comparable's comareTo() method implementation for name
 	@Override
 	public int compareTo(Student o) {
 		// TODO Auto-generated method stub
 		return this.name.compareTo(o.name);  // in this line the compareTo() method is from Integer class not it is calling it self
 	}
	
	
}
