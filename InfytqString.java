import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class InfytqString {
	private static boolean isDig(char dig) {
		if(dig>='0' && dig<='9')
		{
			return true;
		}
	
		return false;
	}


	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pleasenenter the string:");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<s.length(); i++)
		{
			if(isDig(s.charAt(i)))
			{
				String digit=String.valueOf(s.charAt(i));
						hs.add(Integer.parseInt(digit));
			}
		}
		ArrayList<Integer> list=new ArrayList<>(hs);
		Collections.sort(list,Collections.reverseOrder());
		int len=list.size();
		boolean evenDigitFound=false;
		for(int i=len-1; i>=0; i--)
		{
			int dig=list.get(i);
			if(dig%2==0)
			{
				list.remove(i);
				list.add(dig);
				evenDigitFound=true;
				break;
			}
		}
		if(evenDigitFound==false)
			System.out.println("-1");
		for(int x:list)
		{
			System.out.print(x);
		}
		

	}

	

}
