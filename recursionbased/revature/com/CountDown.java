package recursionbased.revature.com;

import java.util.Scanner;

public class CountDown {
	private static void func(int i) {
		if( i==0)
		{
			System.out.println(i);
		}
		else 
		{
			System.out.print(i+" ");
			func(i-1);
		}
	}
		
		

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("please Enter the last Number:");
	int n=sc.nextInt();
	
	func(n);
//	for(int i=1; i<n; i++)
//	{
//		System.out.print(func(i)+" ");
//	}
	}


}