package com.logical.program;

import java.util.Scanner;

public class BiggestMeatBall {
	public static int maxPosition(int[] arr)
	{
		int index=0;
		int max=arr[0];
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
			index=j+1;
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Please Enter the Number of Participent people");
		int p=sc.nextInt();
		System.out.println("Enter the Quantity:");
		int qty=sc.nextInt();
		
		int[] Array=new int[p];
		for( i=0; i<Array.length; i++)
		{
			Array[i]=sc.nextInt();
		}
		
		System.out.println(maxPosition(Array));
		

	}

}
