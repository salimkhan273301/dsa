import java.util.Scanner;

public class TernaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		System.out.println("Enter the third number:");
		int c=sc.nextInt();
	max=	(a>b) ? (a>c ? a:c):(b>c ? b:c);// ternary oprator is used here
	System.out.println("Max value is:");
		System.out.println(max);

	}

}
