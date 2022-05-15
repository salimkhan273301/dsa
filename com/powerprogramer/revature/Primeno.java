package com.powerprogramer.revature;

import java.util.Scanner;

public class Primeno {
	public static void sum(int n)
	
	{
		
	int s=0;
	 int t=n;
	 while(t>0 )
	 {
		 s=s+t%10;
		 t/=10;
	 }
	 if(s==5) 
	 System.out.print(n+" ");
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the last element:");
		int n=sc.nextInt();
		for(int i=2; i<=n; i++)
		{
			int count=0;
			for(int j=2; j<=Math.sqrt(i); j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && i!=1)
			{
				//System.out.print(i+" ");
				//System.out.print(sum(i)+" ");
				sum(i);
				
			}
		}

	}

	
}
