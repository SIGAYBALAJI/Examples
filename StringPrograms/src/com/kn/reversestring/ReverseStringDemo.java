package com.kn.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {
	public static void main(String[] args) {
		

	Scanner scan=new Scanner(System.in);
	System.out.println("enter the reverse string:");

	String inputString=scan.nextLine();
	ReverseString reverseString=new ReverseString();
	String outputString=reverseString.reversingString(inputString);
	System.out.println("the reversed String:"+outputString);
	

}
}
