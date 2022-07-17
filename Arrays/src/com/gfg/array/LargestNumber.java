package com.gfg.array;

public class LargestNumber {

	/*
	 * Naive Approach Time Complexity Big-O(n*n)
	 */
	public static int largestNo(int arr[]) {
		int size = arr.length;

		for (int i = 0; i < size; i++) {
			boolean flag = true;
			for (int j = 0; j < size; j++) {
				if (arr[j] > arr[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				return i;
		}
		return -1;
	}

	/*
	 * efficient solution time complexity Big-O(n)
	 */
	public static int largestNumber(int arr[]) {
		int res = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > arr[res])
				res = i;
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 500, 8, 100, 70, 20 };

		System.out.println(largestNumber(arr));
	}

}
