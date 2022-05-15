import java.util.ArrayList;
import java.util.Scanner;

class PrimeNumber
{
	Scanner sc=new Scanner(System.in);
	
	int a;
	int b;
	//public static ArrayList list=new ArrayList();
	
	
	void input()
	{
		System.out.println("please enter the 1st Value:");
		a=sc.nextInt();
		System.out.println("Please enter the 2nd Value:");
		b=sc.nextInt();
	}
	void output() {
		for(int i=a; i<=b; i++)
		{
	
				if(i%5==0 && i%15==0)	
				{
					System.out.print(i+"\t");
				}
		}
		
	}
	void prime()
	
	{
		int count=0;
		for(int i=a; i<=b; i++)
		{
			
			for(int j=1; j<i; j++ )
			{
				if(i%j==0)
				{
					count++;
					
				}
						if(count==2) {
							System.out.print(i+"\t");
							//list.add(i);
							count=0;
									}break;
									
				
			}
		}
	}
	
}

public class ClassDemo {

	public static void main(String[] args) {
		PrimeNumber obj=new PrimeNumber();
		obj.input();
		//obj.output();
		obj.prime();
		
		
		
		

	}

}
