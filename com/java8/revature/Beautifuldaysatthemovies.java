package com.java8.revature;

import java.util.Scanner;

public class Beautifuldaysatthemovies {
	 public static int beautifulDays(int i, int j, int k) {
		    // Write your code here
		    
		    int count=0;
		    for(int x=i; x<=j; x++)
		    {
		    	int reverse=0;
		        int d=x;
		        while(d>0)
		        {
		          reverse= reverse*10+d%10;
		          d/=10;  
		        }
		        
		        System.out.println(reverse);
		        System.out.println(Math.abs(x-reverse)%k);
		        if((Math.abs(i-reverse))%k==0)
		        	 
		        {
		            count++;
		           
		        }
		      
		    }
		        return count;
		    }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter i:");
		int i=sc.nextInt();
		System.out.println("enter j:");
		int j=sc.nextInt();
		System.out.println("enter k:");
		int k=sc.nextInt();
		System.out.println(beautifulDays( i,  j,  k));
		

	}

}
