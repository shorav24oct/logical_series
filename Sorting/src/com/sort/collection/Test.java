package com.sort.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(4);
		list.add(8);
		list.add(27);
		list.add(24);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
