import java.util.Scanner;

public class Factorialinrange {
	private static int fact(int n)
	{
	
		if(n==0 || n==1)
			return 1;
		else
		
		
		
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the starting point:");
		int a=sc.nextInt();
		System.out.println("please enter the last range:");
		int n=sc.nextInt();
		for(int i=a; i<n; i++)
		{
		System.out.print(fact(i)+"\t");
		}
		

	}

}
