package sorting.revature.com;

import java.util.Scanner;

public class BinarySearchDemo {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Please Enter the size of array:");
		int Size=sc.nextInt();
		int[] arr=new int[Size];
		for( i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Which element you want to Search please Inter:");
		int item=sc.nextInt();
		
		int low=0;
		int high=arr.length-1;
		int middle;
		middle=(low+high)/2;
		while(low<=high)
		{
			if(arr[middle]==item)
			{
				System.out.println("Item is found At [" + middle  + "th ] position");
				break;
			}
			
			else if(arr[middle]<item)
			{
				low=middle+1;
			}
			else {
				high=middle-1;
				}
			middle=(low+high)/2;
		}
		 
		if(low>high)
		{
			System.out.println("Element is not found:");
		}
		

	}

	

}
