import java.util.Scanner;

public class piramidPatt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("enter the number of row:");
		int row=sc.nextInt();
		for( i=0; i<row; i++) {
			for( j=0; j<row-i; j++)
			{
				System.out.print(" ");
				
			}
			int k=0;
			
			while(k!=2*i+1)
			{
				System.out.print("@");
				k++;
			}
			System.out.println();
		}
		

	}

}
