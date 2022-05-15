import java.util.Scanner;

public class StringWorldCount {

	public static void main(String[] args) {
		char Tchar;
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the String:");
		String st=sc.nextLine();
		String st1=st.toUpperCase();
	String	st2=st.substring(0, st.length()/2);
	String st3=st.toLowerCase();
	for(int i=0; i<st.length();i++)
		{
			Tchar=st.charAt(i);
			if(Tchar == ' ' || Tchar=='\t')
				count++;
		}
		System.out.println("Total words are:"+ count);
		System.out.println("In Upper case ");
		System.out.println(st1);
		System.out.println("subString ");
		System.out.println(st2);
		System.out.println("Lower case ");
		System.out.println(st3);
		System.out.println("String  lendth:");
		System.out.println(st.length());
		

	}

}
