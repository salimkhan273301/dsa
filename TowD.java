import java.util.Scanner;

public class TowD {
	public static int hour(int[][] arr) {
		int maxsum=Integer.MIN_VALUE;
	int	row=4;
	int	col=4;
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+
						arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(maxsum<sum)
				{
					maxsum=sum;
				}
				
			}
		}
		return maxsum;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array:");
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		System.out.println("enter the number here:");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(hour(arr));
		
	}

}
