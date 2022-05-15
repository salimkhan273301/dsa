import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s="nadeem";
		String h="hasan";
		String n="nadeem";
		Boolean result=s.equals(n);
		System.out.println(result);
		System.out.println("enter the size of Array1:");
		int n1=sc.nextInt();
		int[] s1=new int[n1];
		for(int i=0; i<n1; i++)
		{
			s1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of Array2");
		int n2=sc.nextInt();
		int[] s2=new int[n2];
		for(int j=0; j<n2; j++)
		{
			s2[j]=sc.nextInt();
		}
		System.out.println("Array s1 is ");
		System.out.println(s1);
		System.out.println("Array s2 is ");
		System.out.println(s2);
		
				
	}
	

}
