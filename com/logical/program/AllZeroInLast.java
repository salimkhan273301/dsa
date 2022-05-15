package com.logical.program;

public class AllZeroInLast {
	private static void zero(int[] A) {
		int k=0;
		for(int i:A)
		{
			if(i!=0)
				{
					A[k++]=i;
				}
		}
		
		for(int j=k; j<A.length; j++)
		{
			A[j]=0;
		}
		for(int r:A)
		{
		System.out.print(r+" ");}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,2,3,0,2,0,4,0,1,0,8,7,6,5};
		zero(A);

	}

	

}
