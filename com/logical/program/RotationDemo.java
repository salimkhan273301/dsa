package com.logical.program;

import java.util.Scanner;

public class RotationDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int e=0;
	System.out.println("Please Enter the No Of Rotation:");
	int r=sc.nextInt();
		int[] temp=new int[r];
		
		int[] arr= {1,2,3,4,5,6,7,8};
		
		System.out.println("Before Rotation");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println("\nAfter rotation:");
		for(int i=0; i<r; i++)
		{
			temp[i]=arr[i];// here we copy the element on the basis of rotation no....
			
		}
		for(int i=0; i<arr.length-r; i++)
		{
			arr[i]=arr[i+r];
		}
		for(int y:arr)
		{
			System.out.print(y+" ");
	 }
		System.out.println();
		for(int j=arr.length-r;j<arr.length; j++ )
		{
			arr[j]=temp[e++];
		}
		
		for(int z:arr)
		{
			System.out.print(z+" ");
		}

	}

}
