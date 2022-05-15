package com.logical.program;

import java.util.Scanner;

public class CountNoofDigit {

	private static void sum(int a) {
		int s=0;
	while(a!=0)
	{
		s=s+a%10;
		a=a/10;
	}
		System.out.println("Sum of the digit is="+s);
	}

	private static void firstdigit(int a) {
		int first=a;
		while(first>=10)
		{
			first=first/10;
		}
		System.out.println("First Digit of the given no:"+first);
		
	}
	private static void lastdigit(int a) {
		int last=a%10;
		System.out.println("Last digit of the Number is:"+last);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("please enter the number:");
		int a =sc.nextInt();
		firstdigit(a);
		lastdigit(a);
		sum(a);
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println("Number of digit in the given number is=" + count);
		
	}

	




}
