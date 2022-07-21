package com.gfg.search;

public class BinarySearchIterative {

	public static int search(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x)
				return mid;
			else if (arr[mid] > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println(search(arr, 70));
	}

}
