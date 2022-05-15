package sorting.revature.com;

import java.util.Scanner;

public class BubbleSort {
	private static int[] bubblesort(int[] arr) {
		int i=0, j=0;
		int temp;
		
		for(i=0; i<arr.length; i++)
		{
			for(j=0; j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
		
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Plese enter the size Array:");
	int s=sc.nextInt();
	int[] arr=new int[s];
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
		bubblesort(arr);
		for(int a:arr)
		{
			System.out.print(a+" ");
		//String c=Integer.toString(a);
			
		System.out.print(a);
			
		}
		
	
		
	}

	

}
