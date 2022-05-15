import java.util.Scanner;

public class HcforGCD {
	private static int gcdoftwoNo(int n1, int n2) {
		//using recursion function i do this.....
		if(n2==0)
		 return n1;
		else
			return gcdoftwoNo(n2,n1%n2); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int gcd=0;
		System.out.println("please enter 1st number:");
		int n1=sc.nextInt();
		System.out.println("Please Enter the Second Number:");
		int n2=sc.nextInt();
		gcdoftwoNo(n1,n2);
		System.out.println("HCF Of "+n1+" and "+n2+" is = "+gcdoftwoNo(n1,n2));
		System.out.println("Greater value between entered element is:"+greatestbwTwo(n1,n2));

	}

	private static int greatestbwTwo(int n1, int n2) {
		//if(x)
		// 
		//int result=(n1>n2)?n1:n2;		
		return (n1>n2)?n1:n2;
	}

	

}
