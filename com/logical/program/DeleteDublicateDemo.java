package com.logical.program;

import java.util.Arrays;

public class DeleteDublicateDemo {
	private static void delete(int[] arr) {
		Arrays.sort(arr);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
		
//		for(int x:arr)
//		{
//			System.out.print(x+"\t");
//			
//		}
		int j=0;
		int temp[]=new int[arr.length];
		
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i]!=arr[i+1])
				{
					temp[j]=arr[i];
				}
				j++;
			}
			temp[j]=arr[arr.length-1];
			System.out.println("After Deleting Dublicate Value:");
			System.out.println(Arrays.toString(temp));
			for(int x:temp)
				{
				if(x==0) // with the help of continue i skip the 0;
					continue;
				System.out.print(x+"\t");
					
				}
		
	}


	public static void main(String[] args) {
		int[] arr= {1,3,7,4,9,8,6,3,4,3,2,10,6,5};
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		delete(arr);
		deletewithouttemp(arr);

	}


	private static void deletewithouttemp(int[] arr) {
		// TODO Auto-generated method stub
//		int count=0;
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=i; j<arr.length; j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					count++;
//				}
//			}
//		}
//		System.out.println("\nno of Dublicate Value:"+count);
//		
		int j=0;
		int dublicateValue=4;
		System.out.println();
		//int temp[]=new int[arr.length];
		
			for(int i=0; i<arr.length-dublicateValue; i++)
			{
				if(arr[i]!=arr[i+1])
				{
					arr[j++]=arr[i];
				}
				//j++;
			}
			//arr[j++]=arr[arr.length-1];
			System.out.println("\nAfter Deleting Dublicate Value withowt  temp[] array:");
			System.out.println(Arrays.toString(arr));
			for(int x:arr)
				{
				if(x==0) // with the help of continue i skip the 0;
					continue;
				System.out.print(x+"\t");
					
				}
		
	}


}
