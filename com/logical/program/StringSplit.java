package com.logical.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {
	
	public static String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
 
		// split to words by space
		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));
		StringBuffer sb = new StringBuffer();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the String:");
		String s=sc.nextLine();
		System.out.println(reverseWords(s));
		System.out.println("==============================");
		System.out.println(reverceString( s));

	}
	public static String reverceString(String s)
	{
	 ArrayList<Character> vowList = new ArrayList<Character>();
	    vowList.add('a');
	    vowList.add('e');
	    vowList.add('i');
	    vowList.add('o');
	    vowList.add('u');
	    vowList.add('A');
	    vowList.add('E');
	    vowList.add('I');
	    vowList.add('O');
	    vowList.add('U');
	 
	    char[] arr = s.toCharArray();
	    System.out.println(Arrays.toString(arr));
	 
	    int i=0; 
	    int j=s.length()-1;
	 
	    while(i<j){
	        if(!vowList.contains(arr[i])){
	            i++;
	            continue;
	        }
	 
	        if(!vowList.contains(arr[j])){
	            j--;
	            continue;
	        }
	 
	        char t = arr[i];
	        arr[i]=arr[j];
	        arr[j]=t;
	 
	        i++;
	        j--; 
	    }
	 
	    return new String(arr);

	}
}
