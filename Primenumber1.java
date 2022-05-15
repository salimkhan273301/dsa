import java.util.Scanner;

public class Primenumber1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the starting number:");
		int a=sc.nextInt();
		System.out.println("please enter the end number:");
		int b=sc.nextInt();
	
	
	
			int count=0;
			for(int i=a; i<=b; i++)
			{
				
				for(int j=1; j<i; j++ )
				{
					if(i%j==0)
					{
						count=count+1;
						
					}
							if(count==2) {
								System.out.print(i+" ");
								count=0;
										}break;
							
					
				}
			
				

	}
	}
}
