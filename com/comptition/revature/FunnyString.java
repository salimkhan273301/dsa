package com.comptition.revature;

import java.util.Arrays;

public class FunnyString {
	 public static String funnyString(String s) {
		    // Write your code here
		 String s1="";
		 
		    int[] arr=new int[s.length()];
		    int[] arr1=new int[s.length()];
		    
		    char[] ch=s.toCharArray();
		    for(int i=ch.length-1; i>=0 ;i--)
		    {
		    	s1+=ch[i];
		    }
		    System.out.println(s1);
		    int i=0;int j=s.length()-1;
		    for(char x:ch)
		    {
		    	arr[i++]=(int)x;
		    	arr1[j--]=(int)x;
		    }
		    System.out.println(Arrays.toString(arr));
		    System.out.println(Arrays.toString(arr1));
		    	
		    
		    char[] ch1=s1.toCharArray();
		    System.out.println(Arrays.toString(ch));
		    System.out.println(Arrays.toString(ch1));
		    
		    	return "Funny";		
		    }

	public static void main(String[] args) {
		String s="acxz";
		System.out.println(funnyString(s));
	}

}
