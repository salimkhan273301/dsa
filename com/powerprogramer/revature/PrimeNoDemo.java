package com.powerprogramer.revature;

import java.util.Scanner;

public class PrimeNoDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
	
		System.out.println("Please enter the last element:");
		int n=sc.nextInt();
		for(int i=2; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				if(i%j==0)
				{
					count++;
				}break;
			}
			if(count==2)
			{
				System.out.print(i+" ");
				count=0;
			}
		}

	}

}
