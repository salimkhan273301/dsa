package com.java8.revature;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List1Demo {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("salim","nadeem","hasan", "rehan","sajid");
		System.out.println(list.toString());
		list.forEach(System.out::println);
		list.forEach(x->System.out.print(x+"\n"));
		Map<Character,Integer> map=new HashMap<>();
		int i=1;
		char x='A';
		while(i<=26 && x<='Z')
		{
			map.put(x++, i++);
		}
	map.forEach((key, value)->	System.out.println(key+" - "+value));
	long count=list.stream().filter(y->y.length()>4).count();
	System.out.println(count);
	
	

	}

}
