package practicesorting;

import java.util.Arrays;

public class Intertionsort {

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(Arrays.toString(arr));
			break;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,5,88,9,34,67,33,22,4,333};
		int l=arr.length;
		System.out.println("Before sorting:");
		print(arr);
		System.out.println("After sorting:");
		sorting(arr,l);
		
		

	}


	private static void sorting(int[] arr, int l) {
		// TODO Auto-generated method stub
	
	
			for(int j=1; j<arr.length; j++) {
				int temp=arr[j];

				int k=j-1;
							
			while(k>=0 && arr[k]>temp)
			{
				arr[k+1]=arr[k];
				k--;
				
			}
			arr[k+1]=temp;
			print(arr);
			
		}
			//print(arr);
		
	}

}
