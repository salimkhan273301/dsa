import java.util.Scanner;

public class FabonicDemo {
	public static int fabonic(int n)
	{
		if (n==0)
		{
			return 0;
		}
		if(n==1 || n==2)
		{
			return 1;
		}
		return fabonic(n-2)+fabonic(n-1);
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number of turm:");
	int term=sc.nextInt();
	System.out.println("Fabonicci Series:");
	sc.close();
	for(int i=0;i<term; i++)
	{
		
		
		System.out.print(fabonic(i)+" ");
	}

	}

}
