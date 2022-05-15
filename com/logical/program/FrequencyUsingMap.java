package com.logical.program;

import java.util.HashMap;
import java.util.Map;

public class FrequencyUsingMap {
	private static void freq(int[] arr, int l) {
		// for Integer find out Frequency
		int max=0;
		int sum=0;
		Map<Integer,Integer> list1=new HashMap<>();
		for(int i=0; i<l; i++)
		{
			if(list1.containsKey(arr[i]))
			{
				list1.put(arr[i], list1.get(arr[i])+1);
			}
			else {
				list1.put(arr[i], 1);
				
				}
		}
		//for(Map.Entry<Integer, Integer>  x :list1.entrySet()) {
		//System.out.println(x.getKey()+"->Frequency=" +x.getValue());
		//}
		for(int x:list1.values())
		{
			if(x>max)
			{
				max=x;
			}
			sum=sum+x;
			System.out.println(x);
			
		}
		
		System.out.println("Sum of rest of MAX Element:");
		System.out.println(sum-max);
	}
		
	

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,2,4,4,4,4,4,8,6,7,6,6,9,10};
		String[] arr1= {"salim","nadeem","ajadi","hasan","salim","sadab","ajadi"};
		freq(arr,arr.length);
		//freq(arr1,arr1.length);
				

	}

	

	private static void freq(String[] arr1, int l) {
		Map<String,Integer> list=new HashMap<>();
		for(int i=0; i<l; i++)
		{
			if(list.containsKey(arr1[i]))
			{
				list.put(arr1[i], list.get(arr1[i])+1);
			}
			else {
				list.put(arr1[i], 1);
				
				}
		}
		for(Map.Entry<String, Integer>  x :list.entrySet()) {
		System.out.println(x.getKey()+"->Frequency=" +x.getValue());
		}
	}

}
