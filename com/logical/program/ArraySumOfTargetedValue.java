package com.logical.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraySumOfTargetedValue {
	 public static int[] twoSum(int[] nums, int target) {
	        int[] result=new int[2];
	        Map<Integer,Integer> map=new HashMap<>();
	        for(int i=0; i<nums.length; i++)
	        {
	           if(map.containsKey(nums[i])){
	               result[0]=map.get(nums[i]);
	               System.out.println(result[0]);
	                result[1]=i;
	               return result;
	           }
	            map.put(target-nums[i],i);
	        }
	        return result;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] nums= {1,3,4,2,7,5,9,8,0,10};
		System.out.println("please Enter the target value:");
		int t=sc.nextInt();
		System.out.println(Arrays.toString(twoSum(nums,t)));
		

	}

}
