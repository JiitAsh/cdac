
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Programmer :) ");
//		Player p1 = new Player();
//		System.out.println(p1.get());
//		
//		Player p2 = new Player("Virat", 36);
//		System.out.println(p2.get());
		
		
//		CktPlayer cp1 = new CktPlayer();
//		System.out.println(cp1.get());
//		
		//CktPlayer cp2 = new CktPlayer("Sachin", 52, 2000);   // we are passing arguments of parent's param ctor too.
//		System.out.println(cp2.get());
//		System.out.println(cp2.getCktPlayerDetails());
		
		
		//System.out.println(cp2.getWrongDetails());
		
		
		Player p1 = new CktPlayer();
		Player p2 = new CktPlayer("Dhoni", 41, 3000);
		System.out.println(p1.get());
		//System.out.println(p1.getCktPlayerDetails());
		
		System.out.println(p2.get());
		//System.out.println(p2.getCktPlayerDetails());
		
		
		
	}

}