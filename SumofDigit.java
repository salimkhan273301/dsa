import java.util.Scanner;

public class SumofDigit {
	private static int sumdigit(int n) {
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Starting rannge:");
		int a=sc.nextInt();
		System.out.println("please enter the  ending range:");
		int n=sc.nextInt();
		for(int i=a; i<n; i++)
		{
		//sumdigit(n);
		System.out.print(sumdigit(i)+"\t");}

	}

	

}
