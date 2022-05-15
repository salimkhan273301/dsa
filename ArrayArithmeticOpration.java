import java.util.Scanner;

public class ArrayArithmeticOpration {
	public static Scanner sc;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("please enter the Size:");
		int Size=sc.nextInt();
		int a[]=new int[Size];
		int b[]=new int[Size];
		int[] Addition=new int[Size];
		int[] Subtraction=new int[Size];
		int[] Division=new int[Size];
		int[] Multiplication=new int[Size];
		float[] Module=new float[Size];
		System.out.println("Please enter the"+Size+" element of Array:");
		int i=0;
		for(i=0; i<Size; i++) {
			a[i]=sc.nextInt();
		
			}
		System.out.println("Please enter the"+Size+" element of Array:");
	
		for(i=0;i<Size; i++) {
			b[i]=sc.nextInt();
			
			}
		
		for(i=0; i<Size; i++)
		{
			Addition[i]=a[i]+b[i];
			Subtraction[i]=a[i]-b[i];
			Multiplication[i]=a[i]*b[i];
			Division[i]=a[i]/b[i];
			Module[i]=a[i]%b[i];
			
			
		}
		System.out.println("\nAdd\t Sub\t Multi\t Div\t Mod");
		for (i = 0; i < Size; i++)
		{
			System.out.print(Addition[i] + " \t ");
			System.out.print(Subtraction[i] + " \t ");
			System.out.print(Multiplication[i] + " \t ");
			System.out.print(Division[i] + " \t ");
		    System.out.print(Module[i]+ " \t ");
		    System.out.print("\n");
		

	}

}
}
