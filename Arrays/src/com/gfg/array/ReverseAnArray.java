package com.gfg.array;

import java.util.Arrays;

public class ReverseAnArray {

	public static void reverse(int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 80 };
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

}
