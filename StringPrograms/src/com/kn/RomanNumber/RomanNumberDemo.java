package com.kn.RomanNumber;

import java.util.Scanner;

public class RomanNumberDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		StringBuffer sb=new StringBuffer();
		String[] srr= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","L"};
		int[] arr= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i=0;i<arr.length;i++)
		{
			while(num>arr[i])
				
			{
				num=num-arr[i];
				sb.append(srr[i]);
			}
		}
		System.out.println(sb);
		
	}

}
