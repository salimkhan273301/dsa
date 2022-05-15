package com.logical.program;

import java.util.Scanner;

public class SelfSufficient {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int sum1=0, sum2=0;
		int neededAmount=0;
		System.out.println("How many Books He HAs To buy That's day:");
		int b=sc.nextInt();
		int[] EarnArray=new int[b];
		int[] CostArray=new int[b];
		System.out.println("Array of Earning for Ith book:");
		for(int i=0; i<b; i++)
		{
			System.out.print("["+(i+1)+"] Book:");
			EarnArray[i]=sc.nextInt();
		}
		System.out.println("Array of Actual COST for Ith book:");
		for(int j=0; j<b; j++)
			
		{
			System.out.print("["+(j+1)+"] Book Cost:");
			CostArray[j]=sc.nextInt();
		}
		for(int k=0; k<b; k++)
		{
			sum1+=EarnArray[k];
			sum2+=CostArray[k];
		}
		neededAmount=Math.abs(sum1-sum2);
		System.out.println(neededAmount);

	}

}
