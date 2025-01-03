package com.cdac.my.practice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ISR_OSW_Practice {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			System.out.print("Enter something: ");
			// let store the input in a string
			String str = "";
			int singleCharUnicode = isr.read();
			while(isr.ready()) {
////				singleCharUnicode = isr.read();   // here it will override the first character by again taking input for second char
				str += (char) singleCharUnicode;
				singleCharUnicode = isr.read();
			}
			
			System.out.println(str);
			isr.close();
		}catch(IOException e) {
			System.err.println(e.getMessage());
//			System.out.println(e.getMessage());   // we can use System.out too

		}
		
		/*
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			String str = "";
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			System.out.print("Enter somethig: ");
			int singleCharUnicode = isr.read(); 
			while(isr.ready()) {
				osw.write(singleCharUnicode);
				singleCharUnicode = isr.read();
			}
			
			osw.close();
			
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
		*/
		
	}

}
