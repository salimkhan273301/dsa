package lamdaexpression.revature.com;

import java.util.ArrayList;

public class Lamdamultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1; i<=10; i++)
		{
			list.add(i);
		}
		list.stream().map(x->x*5).forEach(System.out::println);
	}

}
