import java.util.Scanner;

public class RecursiveSumofNumber {
	private static int  sum(int a) {
		if(a<=0)
		return a;
		else
		return	a+sum(a-1);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number till you want to sum:");
		int a=sc.nextInt();
		System.out.println("Sum is = "+sum(a));
		sc.close();

	}

	

}
