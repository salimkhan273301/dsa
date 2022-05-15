

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("----:Welcome to TWO DIMENTIONAL ARRAY:----");
		System.out.println("enter the size of Row:");
		int row=sc.nextInt();
		System.out.println("Enter the size of Column:");
		int col=sc.nextInt();
		int twoD[][]=new int[row][col];
		System.out.println("enter Array Elements:");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				twoD[i][j]=sc.nextInt();	
			}
			
		}
		System.out.println("Array Elements is:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++)
			{
				System.out.print(twoD[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Choose the element to see adjusent elements:");
		int x=sc.nextInt();
		
		if(twoD[row][col]==x)
		{
			System.out.println("print it");
		}
		
		
		

	}

}

