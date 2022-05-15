import java.util.Scanner;

public class InfyTQDemoAirportAuthority {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int amount=0;
	System.out.println("Please Enter the size Of Array:");
	int n=sc.nextInt();
	int[] laggege=new int[n];
	for(int i=0; i<n; i++)
	{
		laggege[i]=sc.nextInt();
		
	}
	System.out.println("Please Enter the Threesold Value:");
	int k=sc.nextInt();
	for(int i=0; i<laggege.length; i++)
	{
		if(laggege[i]<=k)
		{
			amount++;
		}
		else if(laggege[i]>k)
		{
			amount+=2;
		}
	}
	System.out.println(amount);

	}

}
