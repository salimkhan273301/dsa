package com.logical.program;

import java.util.Scanner;

public class PrimeNoDEmo {
	private static void prim(int a, int b) {
		for(int i=a; i<=b; i++)
		{	int count=0;
			for(int j=2; j<i-1; j++ )
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			System.out.print(i+" ");
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the initial point:");
		int a=sc.nextInt();
		System.out.println("Please Enter the last point");
		int b=sc.nextInt();
	prim(a, b);

	}



}
