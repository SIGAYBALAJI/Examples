package com.kn.anagram;

import java.util.Scanner;

public class AnagramDemo {
	public static void main(String[] args, boolean isanagram) {
		//take input from user
		Scanner scan=new Scanner(System.in);
		System.out.println("enter  a string1=");
		String inputstring1=scan.nextLine();
		System.out.println("enter a String2=");
		String inputstring2=scan.nextLine();
		//create object of anagram class
		AnagramString anagram=new AnagramString();
	
		//call isanagram method
		boolean isanagram=anagram.isanagram(inputstring1,inputstring2);
		//print result
		if(isanagram) {
			System.out.println(inputstring1+"&"+inputstring2+"are anagram strings");
			
		}else {
			System.out.println(inputstring1+"&"+inputstring2+"are not a anagram strings");
		}
		//release resource
		scan.close();
		
	}

}
