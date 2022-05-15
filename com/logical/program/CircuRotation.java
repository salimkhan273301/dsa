package com.logical.program;


import java.util.LinkedList;
import java.util.Scanner;

public class CircuRotation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Linked List:");
		int n = sc.nextInt();
		System.out.println("Enter the no of Circuler Rotation:");
		int k = sc.nextInt();
		System.out.println(" how many  indexed value you want to print:");
		int q = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		int index;
		System.out.println("Now enter the "+ n +" element in linked list:");
		for(int i = 0; i < n; i++)
		{
			list.add(sc.nextInt()); 
		}
		
		while(k > 0)
		{
			int j = list.removeLast();
			list.push(j);
			k--;
			System.out.println(list.toString());
		}
		System.out.print("Enter the index value:");
		while(q > 0)
		{
			index = sc.nextInt();
			System.out.println(list.get(index));
			q--;
		}
		sc.close();
	}

	
}
