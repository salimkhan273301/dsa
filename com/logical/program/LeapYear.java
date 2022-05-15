package com.logical.program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		for(int i=0;i<year; i++)
		{
		leapYear(i);
		}

	}

	private static void leapYear(int i) {
		
		if(i%400==0 || i%4==0 && i%100!=0)
		{
			System.out.print(i+" ");
		}
		
//		else
//		{
//			System.out.println("\nNot Leap year:");
//			System.out.print(i+" ");
//		}
		
	}

}
