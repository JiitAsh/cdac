package com.cdac.my.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FR_FW_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//from file to console
//		File newFile = new File("C:\\Users\\hp\\Desktop\\cdac\\java\\practice\\day15_08oct\\01_FirstIOPro\\src\\com\\cdac\\my\\practice\\abc.txt");
//		try {
//			if(!newFile.exists()) {
//				newFile.createNewFile();
//			}
//			String str="";
//			FileReader fr = new FileReader(newFile);
//			int singleCharUnicode = fr.read();
////			while(singleCharUnicode != -1) {  // this one is good method to check read() is ready or not.
//			while(fr.ready()) {
////				System.out.print((char) singleCharUnicode);
//				str += (char) singleCharUnicode;
//				singleCharUnicode = fr.read();
//			}
//			
//			System.out.println(str);
//			
//			fr.close();   // no need to close it
//			
//		}catch(IOException e) {
//			System.err.println(e.getMessage());
//		}
		
		
		File newFile = new File("C:\\Users\\hp\\Desktop\\cdac\\java\\practice\\day15_08oct\\01_FirstIOPro\\src\\com\\cdac\\my\\practice/Jitesh.txt");
		
		try {
			if(!newFile.exists()) {
				newFile.createNewFile();
			}
			
//			FileWriter fw = new FileWriter(newFile,true);  // if want to append 
			FileWriter fw = new FileWriter(newFile);
			System.out.println("Enter something!!");
			String str = sc.nextLine();
			int size = str.length();
			int i=0;
			while(i<size) {
				fw.write((int) str.charAt(i));
				i++;
			}
			
			fw.close();
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
