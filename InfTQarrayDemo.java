import java.util.Scanner;

public class InfTQarrayDemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the size of array:");
	int index5=0,index8=0,sum1=0;
	String sum2="";
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0; i<n; i++)
	{
		arr[i]=sc.nextInt();
		
	}
	for(int i=0; i<n; i++)
	{
		if(arr[i]==5)
		{
			index5=i;
		}
		else if(arr[i]==8)
		{
			index8=i;
		}
	}
	for(int i=index5; i<=index8; i++)
	{
		sum2+=arr[i];
		
	}
	System.out.println(sum2);
	String s=sum2;
	s=s.chars().mapToLong(Character::getNumericValue).sum()+"";
	Integer s1=Integer.valueOf(s);
	
	for(int j=0; j<arr.length; j++)
	{
		sum1+=arr[j];
	}
	System.out.println(sum1);
	sum1-=s1;
	System.out.println("after subtraction of s1");
	System.out.println(sum1);
	System.out.println("Final Result:");
	Integer f=Integer.parseInt(sum2);
	System.out.println(f+sum1);

	}

}
