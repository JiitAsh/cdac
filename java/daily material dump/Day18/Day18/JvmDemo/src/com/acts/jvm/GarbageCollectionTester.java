package com.acts.jvm;

public class GarbageCollectionTester {
	public static void main(String[] args) {
		Student student1 = new Student(123, "Deepak");
		Student student2 = new Student(124, "Ganesh");

		Student student3 = student2;
		student1 = null; 
		// requesting GC
		System.out.println("1st GC");
		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println(Runtime.version());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		student2 = null; 

		// requesting GC
		System.out.println("2nd GC");
		System.gc();
		

		student3 = null;
		// requesting GC
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("3rd GC");
		System.gc();

	}

}
