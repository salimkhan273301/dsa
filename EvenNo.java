import java.util.Scanner;

public class EvenNo {
	private static void evenNo(int i) {
		if(i%2==0)
		{
			System.out.print(i+"\t");
		}
		
		
		
		
		
	}


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting position:");
	int a=sc.nextInt();
	System.out.println("entrt the ending point:");
	int b=sc.nextInt();
	for(int i=a; i<=b; i++)
	
	evenNo(i);
	

	}

	
}
