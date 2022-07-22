package com.gfg.search;

public class IndexOfFirstOccurrence {

	public static int firstOccurrence(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > x)
				high = mid - 1;

			else if (arr[mid] < x)
				low = mid + 1;

			else {
				if (mid == 0 || arr[mid - 1] != arr[mid])
					return mid;
				else
					high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 20, 20 };
		System.out.println(firstOccurrence(arr, 20));
	}

}
