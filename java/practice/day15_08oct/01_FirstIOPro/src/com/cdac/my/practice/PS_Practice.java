package com.cdac.my.practice;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class PS_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File newFile = new File("C:\\Users\\hp\\Desktop\\cdac\\java\\practice\\day15_08oct\\01_FirstIOPro\\src\\com\\cdac\\my\\practice\\print.txt");
		
		try {
			if(!newFile.exists()) {
				newFile.createNewFile();
			}
			
//			PrintStream ps = new PrintStream(newFile,true); // won't accept appending
			PrintStream ps = new PrintStream(newFile);
			String str = sc.nextLine();
			int size=str.length();
			int i=0;
			while(i<size) {
				ps.write((int) str.charAt(i));
				i++;
			}
			// here no need to use close() it's automatically handles this
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
		
		
		
		sc.close();
	}

}
