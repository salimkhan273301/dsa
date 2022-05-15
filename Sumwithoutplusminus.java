import java.util.Scanner;

public class Sumwithoutplusminus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b=sc.nextInt();
		System.out.println(getsum(a,b));

	}

//	private static int getsum(int a, int b) {
//		// TODO Auto-generated method stub
//		return add(a,b);
//	}

	private static int getsum(int a, int b) {
		// TODO Auto-generated method stub
		if (b==0)
			return a;
		int result=a^b;
		//System.out.println(result);
		int carry=(a&b)<<1;
		//System.out.println(carry);
		return getsum(result,carry);
	}
	

}
