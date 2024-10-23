package com.cdac.acts.TesterFour;
import com.cdac.acts.TesterTwo;
public class TesterFour{
		
	public static void printNameFromTesterFour(String name){
		System.out.println("Hello " + name + " :), from TesterFour class.");
	}
	
	public static void main(String[] args){
		System.out.println("Hello from TesterFour :)");
		TesterTwo tTwoObj = new TesterTwo();
		tTwoObj.printNameFromTesterTwo("Yash Mimani");
	}
}