package com.logical.program;

public class AllSubArrayDemo {
	private static void subArray(int[] arr, int length) {
		for(int s=0; s<length; s++)
		{
			for(int e=s; e<length; e++)
			{
				print(arr,s,e);
			}
		}
		
	}

	private static void print(int[] arr, int s, int e) {
		System.out.print("{");
		for(int i=s;i<=e; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("}\n");
	}

	public static void main(String[] args) {
	int[] arr= {1,2,3,4,-7,-2,-1};
	subArray(arr,arr.length);
	sumzero(arr,arr.length);

	}

	private static void sumzero(int[] arr, int length) {
	
		for(int s=0; s<length; s++)
		{int sum=0;
			for(int e=s; e<length; e++)
			{
				sum+=arr[e];
				if(sum==0)
				{
					System.out.println("SubArray Sum==0 for bellow subarray");
					print(arr,s,e);
					
				}
			}
		}
	}

	

}
