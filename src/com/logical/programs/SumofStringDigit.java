package com.logical.programs;

import java.util.Scanner;

public class SumofStringDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the digit based string:");
		String s=sc.nextLine();
		
		System.out.println("Please Enter the k:");
		int k=sc.nextInt();
		System.out.println(sumDgt(s,k));
		sc.close();


	}

	private static int sumDgt(String s,int k) {
		s=s.chars().mapToLong(Character::getNumericValue).sum()*k+"";
		
		return (s.length()>1)?sumDgt(s,1):Character.getNumericValue(s.charAt(0));
	}

}
