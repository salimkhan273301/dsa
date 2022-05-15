import java.util.Hashtable;
import java.util.Scanner;

public class AddingElementHashTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("enter the size of Hashtable:");
		int n=sc.nextInt();sc.nextLine();
		
		Hashtable<String,Integer> ht=new Hashtable<>(n);
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the name:");
			String name=sc.nextLine();
			System.out.println("Enter the Age:");
			Integer age=sc.nextInt();sc.nextLine();
			ht.put(name, age);
			
		}
		System.out.println(ht);
		System.out.println("if you want to delete the element please enter key:");
		String key=sc.nextLine();
		ht.remove(key);
		System.out.println("after Deletion the table looks:-");
		System.out.println(ht);
		Hashtable<String,Integer> ht1=new Hashtable<>();
		System.out.println("Update the age of any :");
		String na=sc.nextLine();
		System.out.println("enter the age:");
		Integer ag=sc.nextInt();sc.nextLine();
		ht.put(na,ag);
		System.out.println(ht);
		
		
		
	

	}

}
