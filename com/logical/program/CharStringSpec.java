package com.logical.program;

import java.util.Scanner;

public class CharStringSpec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the string here:");
		String s=sc.nextLine();
		char ch;
	int	alp,dig,spl;
	alp=dig=spl=0;
	for(int i=0; i<s.length(); i++)
	{
		ch=s.charAt(i);
						if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
						{
							alp++;
						}
						else if(ch>='0' && ch<='9')
						{
							dig++;
						}
						else
						{
							spl++;
						}
	}
	System.out.println("Number of Alphabate:"+alp);
	System.out.println("Number of Digit:"+dig);
	System.out.println("Number of speciel Char:"+spl);

	}

}
