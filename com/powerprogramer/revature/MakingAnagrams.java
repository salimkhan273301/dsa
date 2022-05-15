package com.powerprogramer.revature;

import java.util.Arrays;
import java.util.Scanner;

public class MakingAnagrams {
	public static int makingAnagrams(String s1, String s2) {
	    // Write your code here
	    int count=0;
	    int[] a1=new int[26];
	    int[] a2=new int[26];
	    for(int i=0; i<s1.length(); i++)
	    {
	        a1[s1.charAt(i)-'a']++;
	    }
	     for(int i=0; i<s2.length(); i++)
	    {
	        a2[s2.charAt(i)-'a']++;
	    }
	     System.out.println(Arrays.toString(a1));
	     System.out.println(Arrays.toString(a2));
	        for( int j=0; j<26; j++)
	        {
	            count+=Math.abs(a1[j]-a2[j]);
	        }
	        return count;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the 1st String:");
		String s1=sc.next();
		System.out.println("Please Enter the 2nd String:");
		String s2=sc.next();
		System.out.println( makingAnagrams(s1,s2));
		

	}

}
