package com.logical.program;

import java.util.Scanner;

public class MatrixDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Matrix:");
		int n=sc.nextInt();
		int[][] array=new int[n][n];
		int[][] array1=new int[n][n];
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length; j++)
			{
				System.out.format("["+i+"]["+j+"]" );
				array[i][j]=sc.nextInt();
				array1[i][j]=sc.nextInt();sc.nextLine();
			}
		}
		System.out.println("\nAdd\tSub\tMul\tDiv\tMod");
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length; j++)
			{
				System.out.format("%d\t",array[i][j]+array1[i][j]);
				System.out.format("%d\t",(array[i][j]-array1[i][j]));
				System.out.format("%d\t",(array[i][j]*array1[i][j]));
				System.out.format("%d\t",(array[i][j]/array1[i][j]));
				System.out.format("%d\t",(array[i][j]%array1[i][j]));
				System.out.println("");
			}
			System.out.println("");
		}
		

	}

}
