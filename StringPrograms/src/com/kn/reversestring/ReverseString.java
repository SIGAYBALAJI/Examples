package com.kn.reversestring;

import java.util.Scanner;

public class ReverseString {
	//method to reverse Specified string

	public String reversingString(String inputString) {
		char[] crr=inputString.toCharArray();
		// TODO Auto-generated method stub
		//convert into character array
		StringBuffer reverseString=new StringBuffer();
		for(int i=crr.length-1;i>=0;i--)
		{
			reverseString=reverseString.append(crr[i]);
			
		}
	
		return reverseString.toString();
	}

	
	
	

}
