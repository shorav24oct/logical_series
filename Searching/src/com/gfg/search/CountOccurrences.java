package com.gfg.search;

public class CountOccurrences {

	public static int countOccurrence(int arr[], int x) {
		int first = IndexOfFirstOccurrence.firstOccurrence(arr, x);
		int last = IndexOfLastOccurrence.lastOccurrence(arr, x);

		if (first == -1)
			return 0;
		else
			return (last - first + 1);

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 20, 20 };
		System.out.println(countOccurrence(arr, 20));
	}

}
