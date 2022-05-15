import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class InfyTQDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the n value:");
		int n=sc.nextInt();
		List<Integer> arr =Arrays.asList(1,2,3,4,4);
		Set<Integer>set=new HashSet<>();
		for(int x:arr)
		{
			set.add(x);
		}
		System.out.println(set.size()-n);

	}

}

