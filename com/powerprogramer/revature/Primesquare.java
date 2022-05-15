package com.powerprogramer.revature;

import java.util.Scanner;

public class Primesquare {
	private static void  squr(int i) {
		int ans=0;
		for(int k=2; k<=i; k++)
		{
			for(int l=1; l<i; l++)
			{
				if(l*l+k*k<=i)
				{
					ans++;
				}
			}
		}
		System.out.println(ans);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Please enter the last element:");
		int n=sc.nextInt();
		System.out.println(Math.sqrt(n));
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
			
		}
		if(count==0 && n!=1)
		{
		System.out.println("Primr number ->"+n);
		squr(n);}
		else
		System.out.println("Not a Prime No");

	}

}
