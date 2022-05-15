package com.comptition.revature;

import java.util.Scanner;

public class Aanagrams {
	public static int anagram(String s) {
	    // Write your code here
	     if (s.length() % 2 != 0)
	            return -1;

	        StringBuilder a = new StringBuilder(s.substring(0, s.length() / 2));
	        StringBuilder b = new StringBuilder(s.substring(s.length() / 2));
	        System.out.println(a);
	        System.out.println(b);

	        for (char c : b.toString().toCharArray()) {
	        	System.out.println(c);
	            int index = a.indexOf(String.valueOf(c));
	            System.out.println(index);
	            if (index > -1)
	                a = a.delete(index, index + 1);
	            System.out.println();
	        }

	        return a.length();

	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String:");
		String s=sc.nextLine();
		System.out.println( anagram(s));
		
		

	}

}
