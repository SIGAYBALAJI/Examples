package com.kn.palindromestring;

public class PalindromeString {
	



	public void ispalindrome(String inputString) {
		char[] crr=inputString.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=crr.length-1;i>-1;i--)
		{
			sb.append(crr[i]);
		}
		String b=sb.toString();
		if(inputString.equals(b)) 
		{
			System.out.println("palindrome String");
			
		}
		else {
		System.out.println(" not a palindrome String");
		
		
		
	}
	}
}
