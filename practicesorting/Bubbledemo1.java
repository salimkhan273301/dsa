package practicesorting;

import java.util.Arrays;

public class Bubbledemo1 {
	private static void sorting(int[] arr, int l) {
		// TODO Auto-generated method stub
		for(int i=0; i<l-1; i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
				//print(arr);
			}
			print(arr);
			if(!flag)
				break;
		}
		//print(arr);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {1,8,5,88,9,334,67,444,33,22,4,33};
		int[] arr= {1,2,3,4,5,6,7,0};
		int l=arr.length;
		System.out.println("Before sorting:");
		print(arr);
		System.out.println("After sorting:");
		sorting(arr,l);
		
		

	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(Arrays.toString(arr));
			break;
		}
		
	}

	

}
