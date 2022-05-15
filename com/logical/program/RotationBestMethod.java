package com.logical.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotationBestMethod {
	public static void show(List<Integer> a)
	{
		System.out.println(a.toString());
	}
	  public static void reverse(List<Integer> arr, int i, int j)
	   {
	       int temp=0;
	       while(i<j)
	       {
	           temp=arr.get(i);
	           arr.set(i, arr.get(j));
	           arr.set(j, temp);
	           i++;
	           j--;
	       }
	       
	   }

	    public static List<Integer> rotLeft(List<Integer> a, int d) {
	    // Write your code here
	    d%=a.size();
	    reverse(a,0,a.size()-1);
	    show(a);
	    reverse(a,0, a.size()-d-1 );
	    show(a);
	    reverse(a, a.size()-d, a.size()-1);
	    return a;
	    }


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter List Size:");
		  int n =sc.nextInt();
		  System.out.println("Enter rotation term:");
		  int d = sc.nextInt();

	        List<Integer> a = new ArrayList<>();
	        System.out.println("Enter ( "+n+" )Element:");
	        for(int i=0; i<n; i++)
	        {
	        	a.add(sc.nextInt());
	        }
	           

		
		List<Integer> result =rotLeft(a, d);
		System.out.println("final result:");
		System.out.println(result.toString());
	}

}
