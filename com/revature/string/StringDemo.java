package com.revature.string;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
	String names[]=new String[5];
	Scanner sc=new Scanner(System.in);
	for(int i=0; i<names.length; i++) {
	System.out.println("Enter the  ["+(i+1)+"] name here:");
	
	names[i]=sc.nextLine();
	}
	for(int j=0; j<names.length; j++) {
		System.out.print(names[j]+"\t");
	}
	
	

}

}