package com.kn.palindromestring;

import java.util.Scanner;

public class PalindromeStringDemo {
	public static void main(String[] args) {
		

	//1.take input from user
		Scanner scan=new Scanner(System.in);
		String inputString=scan.nextLine();
		//2.create object of palindrome class
		PalindromeString palindrome=new PalindromeString();
		//3.call the method specified string is palindrome or not
                 palindrome.ispalindrome(inputString);
                 
		//release resource
		scan.close();
		
	

}
}
