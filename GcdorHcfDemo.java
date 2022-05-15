import java.util.Scanner;

public class GcdorHcfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int gcd=0;
		System.out.println("please enter 1st number:");
		int n1=sc.nextInt();
		System.out.println("Please Enter the Second Number:");
		int n2=sc.nextInt();
		for(int i=1; i<n1 && i<n2; i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		int lcm=(n1*n2)/gcd;// Here i have Calculated the LCM....
		System.out.println("HCF Of "+n1+" and "+n2+" is = "+gcd);
		System.out.println("LCM Of "+n1+" and "+n2+" is = "+lcm);

	}

}
