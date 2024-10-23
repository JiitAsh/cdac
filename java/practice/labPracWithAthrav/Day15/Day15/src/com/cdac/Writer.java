package com.cdac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Writer {

	public static void main(String[] args) throws FileNotFoundException{
		File f=new File("Writer.txt");
		Scanner sc = new Scanner(System.in);
		// file creation
//		try {
//			if(!f.exists()) {
//				f.createNewFile();
//			}else {
//				System.out.println("Aree bhai phle se hi hai, :)");
//			}
//		}
//		catch(IOException e) {
//			System.err.println(e.getMessage());
//		}
		
		
		//OutputStreamWriter:CHARACTER(BYTE)->CHARACTER (CONSOLE->FILE)
//		try {
////			OutputStreamWriter os=new OutputStreamWriter(new FileOutputStream("Writer.txt"));    // will override the data
//			OutputStreamWriter os=new OutputStreamWriter(new FileOutputStream("Writer.txt", true));  // will append into file
//			String data=sc.nextLine();
//			os.write(data);
//			os.flush(); //NECESSARY CONDITION
//		}
//		catch(IOException e) {
//			System.err.println(e.getMessage());
//		}
		
		
		
		//OutputStreamWriter:CHARACTER(BYTE)->CHARACTER (CONSOLE->CONSOLE)
//		try {
//			OutputStreamWriter os1=new OutputStreamWriter(System.out);
//			String data=sc.nextLine();
//			System.out.println(data);
//			os1.flush();
//		}
//		catch(IOException e) {
//			System.err.println(e.getMessage());
//		}
		
		
		//PrintWriter-To write hardcoded data into the file
		
		try {
		PrintWriter pw=new PrintWriter("C:\\Users\\dac.STUDENTSDC\\Batch_1 eclipse workspace\\Day15/writer2.txt");
		pw.println("Hi, this is Printwriter.");
		pw.print(1);
		pw.append("fdjhf");
		pw.close();
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
//		try {
//			PrintWriter pw=new PrintWriter("C:\\Users\\dac.STUDENTSDC\\Batch_1 eclipse workspace\\Day15/writer3.txt");
//			String str=sc.nextLine();
//			pw.append(str);
//			pw.close();
//		}
//		catch(IOException e) {
//			System.err.println(e.getMessage());
//		}
		
	}

}
