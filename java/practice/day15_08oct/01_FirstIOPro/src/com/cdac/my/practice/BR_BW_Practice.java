// to practice BufferReader and BufferWriter
package com.cdac.my.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BR_BW_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		InputStreamReader isr = new InputStreamReader(System.in);
////		BufferedReader br = new BufferedReader(System.in);  // it takes (Reader in) not (InputStream in) so provide Reader not InputStream
//		try {
//			BufferedReader br = new BufferedReader(isr);
//			System.out.println("Enter something: ");
//			String str = br.readLine();
//			System.out.println("your something is: " + str);
//			
//			//br.close();   // it is not necessary
//			
//		}catch(IOException e) {
//			System.err.println(e.getMessage());
//		}
		
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		System.out.print("Enter something: ");
		String str = sc.nextLine();
		int size = str.length()-1;
		try {
			BufferedWriter bw = new BufferedWriter(osw);
			int i=0;
			while(i<=size) {
				
				bw.write((int) str.charAt(i));
				i++;
			}
			
			System.out.print("Your something is: ");
			bw.close();
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
		
		
		
		sc.close();
	}

}
