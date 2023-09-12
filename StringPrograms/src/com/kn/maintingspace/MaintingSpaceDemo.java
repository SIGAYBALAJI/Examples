package com.kn.maintingspace;

import java.util.Scanner;

public class MaintingSpaceDemo {
	public static void main(String[] args) {
		//take input from user
		Scanner scan=new Scanner(System.in);
		String inputstring=scan.nextLine();
		//create object of Mainting Space
		MaintingSpace space=new MaintingSpace();
		//calling the method
	     space.reversestring(inputstring);
		//print result
		//release resource
		scan.close();
		
	}

}
