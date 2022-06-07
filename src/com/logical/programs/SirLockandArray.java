package com.logical.programs;

import java.util.Arrays;
import java.util.List;

public class SirLockandArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,1,1);
		System.out.println(arr.toString());
		balancingSum(arr);

	}

	private static void balancingSum(List<Integer> arr) {
		int x=0; int sum=0;
		for(int a:arr)
		{
			sum+=a;
		
		}
		
		for(int y:arr)
		{
			if(2*x==sum-y) {
				System.out.println("YES");
		}
		System.out.println("2x");
		System.out.println(2*x);
		System.out.println("sum-y");
		System.out.println(sum-y);
		x=x+y;
		System.out.println("x=x+y");
		System.out.println(x);}
	}

}
