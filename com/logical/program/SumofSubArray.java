package com.logical.program;

public class SumofSubArray {
	public static int sumSubArray(int[] arr,int n,int s)
	{
		int csum,i,j;
		for(i=0; i<n; i++)
		{
			csum=arr[i];
			for( j=i+1; j<n; j++)
			{
				if(csum==s)
				
				{
					int p=j-1;
					System.out.println("sum found between  "+i+" and "+p);
					return 1;
					
				}
				if(csum>s || j==n)
				{
					break;
				}
				csum+=arr[j];
				
				
			}
			
		}
		System.out.println("No sub Array found");
		return 0;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,3,5,7,4,1,1,22,10,7,5,8};
		int l=arr.length;
		int sum=44;
		//sumSubArray(arr,l,sum);
		target(arr, l,sum);

	}
// second technique fo solve it....
	private static void target(int[] arr, int l, int sum) {
		// TODO Auto-generated method stub
		//int total=0;
		for(int i=0; i<l; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("["+i+" and "+j+"]");
				}
				
			}
			
		}
		System.out.println("Not found such index");
		
		
		
	}

}
