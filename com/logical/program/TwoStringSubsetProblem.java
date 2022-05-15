package com.logical.program;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class TwoStringSubsetProblem {
	public static void show(int[] arr)
	{
		System.out.println(Arrays.toString(arr));
	}
	
	static String twoStrings(String s1, String s2) {
		int len = s1.length() < s2.length() ? s1.length() : s2.length();
		int arr[] = new int[26];

		for (int i = 0; i < len; i++) {
			int index = s1.charAt(i) - 'a';
			arr[index] = 2;
			show(arr);
		}
		for (int i = 0; i < len; i++) {
			int index = s2.charAt(i) - 'a';
			if (arr[index] > 0)
				show(arr);
				return "YES";

		}
		return "NO";
	}
	
	
	// second method...
	//==========================================================
//	public static void show(int[] arr)
//	{
//		System.out.println(Arrays.toString(arr));
//	}
//
//	
//	
//
//
//
//	    static String twoStrings(String s1, String s2){
//	        int[] cache = new int[256];
//
//	        for (int i = 0; i < s1.length(); i++) {
//	            cache[(int)s1.charAt(i)]++;
//	            show(cache);
//	        }
//
//	        for (int i = 0; i < s2.length(); i++) {
//	            if (cache[(int)s2.charAt(i)] != 0) {
//	            	System.out.println("S2 check");
//	            	show(cache);
//	                return "YES";
//	            }
//	        }
//
//	        return "NO";
//	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int i = 0; i < q; i++){
	            String s1 = in.next();
	            String s2 = in.next();
	            String result = twoStrings(s1, s2);
	            System.out.println(result);
	        }
	    }
	}