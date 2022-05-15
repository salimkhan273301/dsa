package com.logical.program;

import java.util.Scanner;

public class ArrayLeftRotationOtherMethod {
	private static void reverse(int[] arr, int i, int j) {
		int temp=0;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Please Enter the Turm Of Rotation:");
		int k=sc.nextInt();
		System.out.println("Before Rotation");
		print(arr);
		rotation(k, arr);
		System.out.println("\nAfter Rotation");
		print(arr);
				
		

	}

	private static void rotation(int k, int[] arr) {
		k%=arr.length;
		 // Reverse all numbers
		reverse(arr, 0, arr.length-1);
		print(arr);
		// Reverse first arr.length-k numbers
		reverse(arr, 0, arr.length-k-1);
		//print(arr);
		 // Reverse last k numbers
		reverse(arr, arr.length-k, arr.length-1);
		//print(arr);
		
		
	}

	
	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
		{
		System.out.print(arr[i]+" ");
		
		}
System.out.println();

		
	}

}
