package com.cdac.acts;
import com.cdac.acts.TesterTwo;
import com.cdac.acts.TesterFour.TesterFour;
public class TesterThree{
	public static void main(String[] args){
		System.out.println("Hello from TesterThree");
		/*
		TesterTwo tTwoObj = new TesterTwo();
		tTwoObj.printNameFromTesterTwo("Jitesh Kumawat");
		*/
		
		TesterFour tFourObj = new TesterFour();
		tFourObj.printNameFromTesterFour("Ritik Sharma");
	}
}