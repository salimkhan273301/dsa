import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First value : ");
		a = sc.nextInt();	
		
		System.out.print(" Please Enter the Second value : ");
		b = sc.nextInt();	
		
		System.out.println("\n Before : a =  " + a + " and b =  " + b);
		
		a = a ^ b;
		System.out.println(a);
		b = a ^ b;
		System.out.println(b);
		a = a ^ b;
		System.out.println(a);
		
		System.out.println("\n After :  a =  " + a + " and b =  " + b);

	}

}
