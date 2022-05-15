package sorting.revature.com;

import java.util.Scanner;

public class InsertionDemo {// Insertion sorting

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		
		System.out.println("enter the size of array:");
		int s=sc.nextInt();
		int[] arr=new int[s];
		for( i=0; i<arr.length; i++)
		
		{
		 	System.out.println("please enter ["+(i+1)+"] element:");
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		sort(arr);
		
	}
		public static void sort( int[] arr1)
		{
			for(int i=1; i<arr1.length; i++)
			{
				int temp=arr1[i];
				int k=i-1;
				while(k>=0 && arr1[k]>temp)
				{
					arr1[k+1]=arr1[k];
					k--;
					
				}
				arr1[k+1]=temp;
				
			}
			for(int x:arr1)
			{
			
				System.out.print(x+" ");
			}
			
		}
	
		


	}


