package com.comptition.revature;

import java.util.Arrays;

public class AnagramsDemo {
	static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length())
        return false;
        int[] arr=new int[26];
        
        for(int i=0; i<a.length(); i++)
        {
          int index=a.charAt(i)-'a';
          arr[index] ++; 
        }
        System.out.println(Arrays.toString(arr));
         for(int i=0; i<b.length(); i++)
        {
          int index=b.charAt(i)-'a';
          arr[index]--; 
        }
         System.out.println(Arrays.toString(arr));
        for(int i=0; i<26; i++)
        {
            if(arr[i]!=0)
            return false;
        }
        System.out.println(Arrays.toString(arr));
        return true;
        
    }


	public static void main(String[] args) {
		String a="RAT";
		String b="ACT";
		System.out.println(isAnagram(a,b));

	}

}
