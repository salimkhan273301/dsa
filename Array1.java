import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int j=0;
	System.out.println("please enter the size of array:");
	int n=sc.nextInt();
	int num[]=new int[n];
	int i=0;
	System.out.println("please enter Array Elements:");
	while(i<n)
	{
		System.out.print("please enter ["+(i+1)+"] Element:");
		num[i]=sc.nextInt();
		i++;
	}
	   
while(j<n)
{
	System.out.print(num[j]+"\t");
	j++;
}
	}

}
