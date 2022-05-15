package sorting.revature.com;

import java.util.Arrays;

public class QuickSortDemojava {
	static int partition(int[] arr, int low, int high)
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
		System.out.print("Value of Low:"+low+" ");
		show(arr);
		return low;
		
	}
	
	private static void show(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arr));
		
	}

	static void quicksortrecursion(int[] arr, int low, int high)
	{
		int p=partition(arr, low, high);
		//System.out.println("Value of P"+p);
		if(low<p-1)
		{
			quicksortrecursion( arr, low,p-1);	
		}
		if(p+1<high)
		{
			quicksortrecursion(arr, p,high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,2,3,8,0,7,11,5};
		
		quicksortrecursion(arr,0,arr.length-1);

	}
	

}
