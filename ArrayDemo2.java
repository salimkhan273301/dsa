import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int total=0;
		System.out.println("Enter the size of Array:");
		int Size=sc.nextInt();
		int[] arr=new int[Size];
		System.out.println("Enter the ["+(Size)+"] Element:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum of the Array Element:");
		
		for(int j=0; j<arr.length; j++)
		{
			 total= total+arr[j];
		}
		System.out.println(total);
		System.out.println("find the max element in Array");
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max);
			max=arr[i];
			
		}
		System.out.println("======: MAX ELEMENT IS:=====");
		System.out.println(max);
		System.out.println("copy the first Array element in to 2nd Array:");
		int[] arr1=new int[arr.length];
		for(int j=0; j<arr.length; j++)
		{
			arr1[j]=arr[j];
			System.out.println(arr1[j]); 
		}
		System.out.println("===::final arr1 is ::===");
		for(int j=0; j<arr.length; j++)
		{
			
		
		System.out.println(arr1[j]);
		sc.close();
	}
	}

}
