package com.logical.program;

import java.util.Scanner;

public class ArrayLeftRotation {

	private static int[] rotation(int k, int[] arr) {
		k%=arr.length;
		System.out.println("Rotation Term:"+k);
		int j=0;
	
		int[] temp=new int[k];
		for(int i=0; i<temp.length; i++)
		{
			temp[i]=arr[i];
		}
		print(temp);
		for(int i=0; i<arr.length-k; i++)
		{
			arr[i]=arr[i+k];
		}
		print(arr);
		for(int i=arr.length-k; i<arr.length; i++)
		{
			//arr[i]=temp[i-k+1];// this is confusing code which is not working  for every term...
			arr[i]=temp[j++];
		}
		return arr;	

}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int[] arr= {1,2,3,4,5};
	System.out.println("Please Enter the Turm Of Rotation:");
	int k=sc.nextInt();
	System.out.println("Before Rotation");
	print(arr);
rotation(k, arr);
System.out.println("\nAfter Rotation");
	print(arr);

	}

private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++)
				{
				System.out.print(arr[i]+" ");
				
				}
		System.out.println();
	}

}
