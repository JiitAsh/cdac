
public class Player {
	private String name;
	private int age;
	
	public Player() {
		System.out.println("Player default ctor!!");
		name="";
		age=0;
	}
	
	public Player(String name, int age) {
		//this();
		System.out.println("Player param ctor!!");
		this.name = name;
		this.age = age;
	}
	
	public String get() {
		System.out.println("Player class get() method");
		return "name: " + name
				+ ", age: " + age;
	}
	
	
//	public String getWrongDetails() {
//		System.out.println("Player class getWrong() method");
//		return "name: " + name
//				+ ", age: " + age;
//	}
}
