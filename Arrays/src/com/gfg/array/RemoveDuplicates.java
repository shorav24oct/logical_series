package com.gfg.array;

import java.util.Arrays;

public class RemoveDuplicates {

	/*
	 * Naive Solution Time Complexity Big-O(n) Space Complexity Big-O(n)
	 */
	public static void remDuplicates(int arr[]) {
		int temp[] = new int[arr.length];
		temp[0] = arr[0];
		int res = 1;

		for (int i = 1; i < arr.length; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}
		for (int i = 0; i < arr.length; i++)
			arr[i] = temp[i];
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * efficient solution Time Complexity Big-O(n) Space Complexity Big-O(1)
	 */
	public static void removeDuplicates(int[] arr) {
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 30, 30 };
		System.out.println(Arrays.toString(arr));
		removeDuplicates(arr);
	}

}
