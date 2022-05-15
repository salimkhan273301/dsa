import java.util.Scanner;

public class AddnumberFun {
	private static void sum(int a, int b) {
		// TODO Auto-generated method stub
		int add=a+b;
		System.out.print("Sum =");
		System.out.print(add);
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the 2nd number:");
		int b=sc.nextInt();
		sum(a,b);
		

	}

	
}
