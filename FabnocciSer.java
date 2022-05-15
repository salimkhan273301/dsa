import java.util.Scanner;

public class FabnocciSer {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int c=0; 
		System.out.println("Enter the range of the fabonic series:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		
		{
			System.out.print(a+"\t");
			c=a+b;
			a=b;
			b=c;
			
		}
		
		

	}

}
