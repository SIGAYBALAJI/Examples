package com.kn.anagram;

public class Anagram {

	public boolean isanagram(String inputstring1, String inputstring2) {
		char[] crr1=inputstring1.toCharArray();
		char[] crr2=inputstring2.toCharArray();
		crr1=sortcharacterArray(crr1);
		crr2=sortcharacterArray(crr2);
		for(int i=0;i<crr1.length;i++)
		{
			if(crr1[i]!=crr2[i])
			{
				isanagram=false;
			}
			isanagram=true;
		}
		
		
		return isanagram;
		
		
	}
	public char[] sortcharacterArray(char[] crr)
	{
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr.length-1-i;j++)
			{
				if(crr[j]>crr[j+1])
				{
					char temp=crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=temp;
				}
			}
		}
		return crr;
		
	}

}
