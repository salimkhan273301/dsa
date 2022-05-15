package com.logical.program;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SumUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		System.out.println(list.toString());
		Integer sum=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

	}

}
