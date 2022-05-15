package com.logical.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CommonArrayItem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of Array A:");
		int a=sc.nextInt();
		System.out.println("Size of Array B:");
		int b=sc.nextInt();
		int[] A=new int[a];
		int[] B=new int[b];
		System.out.println("enter the element in Array A");
		for(int i=0; i<A.length; i++)
		{
			A[i]=sc.nextInt();
		}
	System.out.println("Enter the Element in Array B:");
	for(int j=0; j<B.length; j++)
	{
		B[j]=sc.nextInt();
	}
	HashSet<Integer> list=new HashSet<>(Arrays.asList(A));
	HashSet<Integer> list1=new HashSet<>();
	list.retainAll(list1);
	System.out.println(list);

	}

}
