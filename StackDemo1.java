import java.util.Scanner;
import java.util.Stack;

public class StackDemo1 {

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
		System.out.println("Stack Before Reverse:");
		System.out.println(s1);
		
		Stack<Integer> s2=new Stack<>();
		for(int i=0; i<elements; i++) {
			int x=s1.pop();
			s2.push(x);
		}
		System.out.println("Stack s2 After reverse:");
		System.out.println(s2);
		
		System.out.println("Stack S1 after opration:");
		s1=(Stack)s2.clone();
		System.out.println("Stack S1:-"+s1);
	}

}
