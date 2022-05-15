import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of element you want enter:");
		int elements=sc.nextInt();
		Stack<Integer> s1=new Stack<>();
		for(int i=0; i<elements; i++)
		{
			System.out.println("please enter the [" +(i+1)+"] element:");
			s1.push(sc.nextInt());
		}
		System.out.println(s1);
		sc.nextLine();
		Stack<String> s2=new Stack<>();
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter String type ["+(i+1)+"] element:");
			s2.push(sc.nextLine());
		}
		System.out.println(s2);
		
		System.out.println("now delete 2 element from Stack s1");
		
		for (int i=0; i<2; i++)
		{
			s1.pop();
			System.out.println(s1);
			
		}
		System.out.println("now i delete all element from S2");
		for(int i=0; i<3; i++)
		{
			s2.pop();
			System.out.println(s2);
		}
		System.out.println("S1 ofter the Operation");
		System.out.println(s1);
		System.out.println("S2 after the opration is Done:-");
		System.out.println(s2);

	}

}
