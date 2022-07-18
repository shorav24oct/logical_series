package com.gfg.array;

public class ArraySortedOrNot {

	public static String isSorted(int[] arr) {

		for (int i = 1; i < arr.length; i++)
			if (arr[i] < arr[i - 1])
				return "No";
		
		return "Yes";
	}

	public static void main(String[] args) {
		int[] arr = { 500, 200, 100 };
		System.out.println(isSorted(arr));
	}

}
