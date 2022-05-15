package com.logical.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDublicate {
	private static void finddublicate1(int[] arr) {
		List<Integer> list1=new ArrayList<>();
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
		{
		int index=Math.abs(arr[i])-1;
		//System.out.println(index);
		 if (arr[index] < 0)
		        list1.add(index + 1);

		      // Flip the number at the index to negative
		      arr[index] = arr[index] * -1;
		    }

		    for(int y:list1) System.out.print(y+" ");;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,1,2,8};
		//Arrays.sort(arr);
		//findaDublicate(arr);
		finddublicate1(arr);
		

	}

	

	private static void findaDublicate(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		for(int x:arr) {
			if(set.contains(x))
			{
				list.add(x);
			}
			set.add(x);
		}
		print(list);
		orignal(set);
	}

	private static void orignal(Set<Integer> set) {
		// TODO Auto-generated method stub
		//Collections.sort(null);
		System.out.println("element without dublicate:");
		set.stream().forEach(System.out::print);
		
	}

	private static void print(ArrayList<Integer> list) {
		Collections.sort(list);
		
		list.stream().forEach(System.out::println);
		
		
		
	}

}
