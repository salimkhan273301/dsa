package com.logical.program;

import java.util.Arrays;

public class ElementandFrequency {

private static void freq(int[] arr,int n) {
	boolean[] visited=new boolean[n];
	Arrays.fill(visited, false);
	for(int i=0; i<n; i++)
	{
		if(visited[i]==true)
		{
			continue;
		}
		int count=1;
		for(int j=i+1; j<n; j++)
		{
			if(arr[i]==arr[j])
			{
				
				visited[j]=true;
				count++;
			}
		}
		System.out.println(arr[i]+"->Frequency= "+count);
	}
		
		
	}
	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,4,4,4,4,4,8,6,7,6,9,10};
		String[] arr1= {"salim","nadeem","ajadi","hasan","salim"};
		freq(arr,arr.length);
		freq(arr1,arr1.length);
				
				
		}
	private static void freq(String[] arr1, int length) {
		// TODO Auto-generated method stub
		
		
		boolean[] visited=new boolean[length];
		Arrays.fill(visited, false);
		for(int i=0; i<length; i++)
		{
			if(visited[i]==true)
			{
				continue;
			}
			int count=1;
			for(int j=i+1; j<length; j++)
			{
				if(arr1[i]==arr1[j])
				{
					
					visited[j]=true;
					count++;
				}
			}
			System.out.println(arr1[i]+"->Frequency= "+count);
		}
		
	}

	

	}


