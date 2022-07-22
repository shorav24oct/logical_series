package com.gfg.search;

public class IndexOfLastOccurrence {

	public static int search(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > x)
				high = mid - 1;

			else if (arr[mid] < x)
				low = mid + 1;

			else {
				if (mid == arr.length - 1 || arr[mid + 1] != arr[mid])
					return mid;
				else
					low = mid + 1;

			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 20, 30 };
		System.out.println(search(arr, 20));
	}

}
