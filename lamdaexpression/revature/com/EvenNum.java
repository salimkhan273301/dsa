package lamdaexpression.revature.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		
		System.out.println("Plese enter the number till you want to print even no:");
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			list.add(i);
		}
		for(int x:list)
		{
			System.out.print(x+" ");
		}
		System.out.println("\nEven No::");
		list.forEach(y-> {if (y%2==0) System.out.print(y+" ");});
		System.out.println("\nPrint odd  No");
		
		list.forEach(z->{if (z%2!=0) 
		
		
		System.out.print(z+" ");});
		System.out.println("Sum of List:");
		

	}

}
