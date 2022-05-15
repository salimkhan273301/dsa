import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> name=new LinkedList<>();
		System.out.println("no of elements you want to enter:");
		int n=sc.nextInt();sc.nextLine();
		
		System.out.println("Enter the name here:");
		for(int i=0; i<n; i++) {
			String y=sc.nextLine();
			name.add(y);
		
			
		}
		
		System.out.println(name);
		
		
		System.out.println("please write the element you want to delet:");
		String y=sc.nextLine();
		name.remove(y);
		System.out.println("after delete linked list is:");
		System.out.println(name);

}
	
}
