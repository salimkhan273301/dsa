package com.logical.program;

import java.util.Scanner;

public class FabnocciArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibnocci(n));
		

	}

	private static int fibnocci(int n) {
		// TODO Auto-generated method stub
		int f[]=new int[n+3];
		int i=0;
		f[0]=0;
		f[1]=1;
		for(i=2; i<=n; i++) {
			f[i]=f[i-1]+f[i-2];
		}
		
		return f[n];
	}

}
