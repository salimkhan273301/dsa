package sorting.revature.com;

import java.util.Scanner;

public class QuickSortDemo {
	public static Scanner sc=new Scanner(System.in);
	
	private static void show(int[] arr) {
		System.out.println("\nAfter the sorting the array is->");
		for(int y:arr) {
			System.out.print(y+" ");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the size of array:");
		int Size=sc.nextInt();	
		int[] arr=new int[Size];
		System.out.println("Please enter the [" +(Size)+"] element");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered element are->");
		for(int x:arr)
		{
			System.out.print(x+" ");
			
		}
		int a=arr.length;
		QuickSortDemo obj=new QuickSortDemo();
		obj.quicksortrecursion(arr,0,a-1);
		
		obj.show(arr);
		
	}
		
		int partition(int[] arr, int low, int high)
		{
			//System.out.println("Value of Low=");
			int pivot=arr[(low+high)/2];
			while(low<=high)
			{
				while(arr[low]<pivot)
				{
					low++;
				}
				while(arr[high]>pivot)
				{
					high--;
				}
						if(low<=high)
						{
							int temp=arr[low];
							arr[low]=arr[high];
							arr[high]=temp;
							low++;
							high--;
						}
			}
			//System.out.print(low+" ");
			show(arr);
			return low;
			
		}
		
		void quicksortrecursion(int[] arr, int low, int high)
		{
			int p=partition(arr, low, high);
			//System.out.println("Value of P"+p);
			if(low<p-1)
			{
				quicksortrecursion( arr, low,p-1);	
			}
			if(p+1<high)
			{
				quicksortrecursion(arr, p+1,high);
			}
		}
		
		
	



}
