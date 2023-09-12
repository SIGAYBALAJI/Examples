package com.kn.characterfrequency;

import java.util.Scanner;

public class CharacterFrequencyDemo {
	public static void main(String[] args) {
		//Take input from user
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a String=");
		String inputstring=scan.nextLine();
		//create object of characterfrequency class
		CharacterFrequency frequencycount=new CharacterFrequency();
		
		//call method to findcharacterfrequencycount
		frequencycount.findcharactercount(inputstring);
		//release resource
		scan.close();
	}

}
