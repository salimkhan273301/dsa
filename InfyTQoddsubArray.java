import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InfyTQoddsubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the test case:");
		int t=sc.nextInt();
		while(t-->0)
		{
			HashSet<String>set=new HashSet<>();
			System.out.println("enter the size:");
			int s=sc.nextInt();
			
			int arr[]=new int[s];
			for(int i=0; i<s; i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			
			for(int j=0; j<arr.length; j++)
			{
				int sum=arr[j];
				if(sum%2!=0)
				{
					set.add(arr[j]+"");
				}
				StringBuilder sb=new StringBuilder();
				sb.append(arr[j]);
				for(int i=j+1; i<arr.length; i++)
				{
					sum+=arr[i];
					sb.append(arr[j]);
					if(sum%2!=0) set.add(sb.toString());
					System.out.println(set.toString());
				}
				
			}
			System.out.println(set.size());
		}
		

	}

}
