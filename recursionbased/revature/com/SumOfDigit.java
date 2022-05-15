package recursionbased.revature.com;

import java.util.Scanner;

public class SumOfDigit {
	public static int func(int n)
	{
		if(n==0)
			return 0;
		else
			return n%10+func(n/10);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please Enter the first Number:");
		int a=sc.nextInt();
		System.out.println("Please enter the last Digit:");
		int b=sc.nextInt();
		
				for(int i=a; i<=b; i++)
	{
			System.out.print(func(i)+" ");
		}

	}

}
