package sorting.revature.com;

import java.util.Scanner;

public class SelectionSorting {
	private static void selectionsort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++)
		{
			int min=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.println("Enter Elements");
		for(int i=0; i<arr.length; i++)
			{
			arr[i]=sc.nextInt();		
			}
		
		selectionsort(arr);

	}

	

}
