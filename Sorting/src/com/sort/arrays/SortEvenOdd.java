package com.sort.arrays;

import java.util.Arrays;
import java.util.Comparator;

class MyComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o1 % 2 - o2 % 2;
	}

}

public class SortEvenOdd {

	public static void main(String[] args) {
		Integer[] arr = { 5, 20, 10, 3, 7 };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, new MyComp());
		System.out.println(Arrays.toString(arr));
	}

}
