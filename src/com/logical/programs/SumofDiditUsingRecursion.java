package com.logical.programs;

import java.util.Scanner;

public class SumofDiditUsingRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number:");
		int n=sc.nextInt();
		System.out.println(sumDgt(n));
		sc.close();

	}

	private static int sumDgt(int n) {
		// TODO Auto-generated method stub
	
		if(n<10)
		{
		return n;}
		else
		{
			return n%10+sumDgt(n/10);
		}
		
		
	}

}
