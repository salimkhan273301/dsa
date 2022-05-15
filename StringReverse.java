import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the string:");
	String str=sc.nextLine();
	
	String dub="";
	for(int i=str.length()-1; i>=0; i--)
	{
		dub=dub+str.charAt(i);
	}
	sc.close();
    System.out.print(dub);
	}


}
