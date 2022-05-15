import java.util.ArrayList;
import java.util.Scanner;

public class PalindromNo {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting point:");
		int a=sc.nextInt();
		System.out.println("enter end point:");
		int b=sc.nextInt();
		for(int i=a; i<b; i++)
		palindrom(i);
	

	}

	private static void palindrom(int s) {
		ArrayList<Integer> list=new ArrayList<>();
		
		int x=s;
		int p=0;
		while(s>0)
		{
		p=p*10+s%10;
		s=s/10;
		}
		if(p==x) {
		//System.out.print(p+"\t");
		//ArrayList<Integer> list=new ArrayList<>();
		list.add(p);
		for(Integer l:list)
		{
			System.out.print(l+" ");
		}
		
		}
		
		
		
	}
	

}
