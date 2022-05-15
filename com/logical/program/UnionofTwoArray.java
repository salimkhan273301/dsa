package com.logical.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UnionofTwoArray {
	private static void union(int[] a, int[] b, int a2, int b2) {
		HashSet<Integer> s=new HashSet<>();
		for(int i=0; i<a2; i++)
			
		{
			s.add(a[i]);
		}
		for(int j=0; j<b2; j++)
		{
			s.add(b[j]);
		}
		System.out.println(s.toString()+" ");
	}
	private static void unionMap(int[] a1, int[] b1, int a3, int b3) {
	
		Map<Integer,Integer> r=new HashMap<>();
		for(int i=0; i<a3; i++)
			
		{
			r.put(a1[i],i);
		}
		for(int j=0; j<b3; j++)
		{
			r.put(b1[j],j);
		}
		 System.out.println("The union set of both arrays is :");
		    for(Map.Entry x : r.entrySet())
		    {
		        //System.out.print(x.getValue() + " ");
		        System.out.print(x.getKey() + " ");
		        
		         
		        // mp will contain only distinct
		        // elements from array a and b
		    }
	}

	


	public static void main(String[] args) {
		int[] A= {1,2,4,6,8,5,4,3,3,1};
		int[] B= {7,10,11,11,9,9,10,12,5,4,3,2};
		int a=A.length;
		
		int b=B.length;
		union(A,B,a,b);
		unionMap(A,B,a,b);

	}

	
	

}
