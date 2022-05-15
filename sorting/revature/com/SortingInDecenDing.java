package sorting.revature.com;

import java.util.Scanner;

public class SortingInDecenDing {

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.println("Enter Elements");
		for(int i=0; i<arr.length; i++)
			{
			arr[i]=sc.nextInt();		
			}
		
		sort(arr);


	}

	

}
