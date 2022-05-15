import java.util.Arrays;
import java.util.Scanner;

public class InfyTQDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ");
		int n1=sc.nextInt();
		int[] earn=new int[n1];
		for(int i=0; i<n1; i++)
		{
			earn[i]=sc.nextInt();
		}
		System.out.println("Enter the Book:");
		int n2=sc.nextInt();
		int[] book=new int[n2];
		for(int j=0; j<n2; j++)
		{
			book[j]=sc.nextInt();
		}
		System.out.println(Arrays.toString(earn));
		System.out.println(Arrays.toString(book));
		
		int sum1=0;
		int sum2=0;
		for(int x:earn)
		{
			sum1+=x;
		}
		for(int y:book)
		{
			sum2+=y;
		}
		System.out.println(sum2-sum1);

	}

}
