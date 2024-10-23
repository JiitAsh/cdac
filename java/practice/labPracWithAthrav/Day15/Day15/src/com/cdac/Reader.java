package com.cdac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

	public static void main(String[] args) throws IOException {
		File f=new File("file1.txt");
		
		/*    InputStreamReader-CONSOLE->CONSOLE (BYTE->CHAR)
		f.createNewFile();
		try {
		InputStreamReader is=new InputStreamReader(System.in);
			int data=is.read();
			while(is.ready()) {
				System.out.println((char)data);
				data=is.read();
			}
			is.close();
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		*/
		
		/*	 FileReader FILE->CONSOLE  (BYTE->CHAR)
		try {
		FileReader fr=new FileReader("file1.txt");
			int data=fr.read();
			while(fr.ready()) {
				System.out.println((char)data);
				data=fr.read();
			}
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		*/
		
		
		/* BufferedReader-1 CONSOLE -> CONSOLE (CHAR->CHAR)
		// method 1
//		InputStreamReader is=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(is);
		
		// method 2
		try {
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			System.out.println(br1.readLine());
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
		*/
		
		
		
		
		/* BufferedReader-1 FILE -> CONSOLE (BYTE->CHAR)
		try {
//			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in, "file1.txt"));
			BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
//			System.out.println(br1.readLine());     // reads only single until enter is encountered
			
			//To read 2 lines from the file
			System.out.println(br1.readLine());
			System.out.println(br1.readLine());
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
		*/
		
		
		
	}
}
