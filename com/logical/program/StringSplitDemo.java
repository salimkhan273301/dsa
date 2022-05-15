package com.logical.program;

import java.util.Scanner;

public class StringSplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		s=s.trim();
		if(s.length()==0)
		{
			System.out.println("0");
		}
		else
		{
			String[] x=s.split("[,.=';:()$#@!-]+");
			System.out.println(x.length);
			for(String y:x)
			{
				System.out.println(y);
			}
		}

	}

}
