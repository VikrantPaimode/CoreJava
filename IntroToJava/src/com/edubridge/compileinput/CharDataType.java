package com.edubridge.compileinput;
import java.util.Scanner;

public class CharDataType {
     
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		char x=s.next().charAt(0);
		boolean y=s.nextBoolean();
		
		System.out.println("The char value is:"+x);
		System.out.println("The Boolean value is:"+y);
	}
	
}
