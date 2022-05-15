package com.logical.program;

import java.util.Scanner;

public class RecursionDiditsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a numaric String:");
		String s=sc.nextLine();
		System.out.println("Enter the k value:");
		int k=sc.nextInt();//s*k eg=148*3=148148148;and then sum of digit.
			System.out.println(sumofDgt(s,k));
	}

	private static int sumofDgt(String n, int k) {
		 n = n.chars().mapToLong(Character::getNumericValue).sum()*k  + "";
		 System.out.println(n);
	        return (n.length() > 1) ?sumofDgt(n, 1) : Character.getNumericValue(n.charAt(0));
		
	}

}
