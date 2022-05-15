package com.logical.program;

import java.util.Arrays;
import java.util.Scanner;

public class NumberFind {
	  private static boolean binarySearch(int[] arr, int numberToFind) {

		    int left = 0;
		    int right = arr.length - 1;

		    while (left <= right) {
		      int mid = left + (right - left) / 2;
		      if (arr[mid] == numberToFind) 
		        return true;
		      if (arr[mid] < numberToFind) 
		        left = mid + 1;
		      else 
		        right = mid - 1;
		    }
		    return false;
		  }

		  public static int pairs(int k, int[] arr) {

		    // Sort the array
		    Arrays.sort(arr);

		    int result = 0;
		    for (int i : arr) {
		      int numberToSearch = i - k;
		      if (binarySearch(arr, numberToSearch)) {
		        result++;
		      }
		    }

		    return result;
		  }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		
	
		
		System.out.println(pairs(k,arr));

	}

}
