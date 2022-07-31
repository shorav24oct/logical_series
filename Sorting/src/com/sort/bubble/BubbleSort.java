package com.sort.bubble;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swaping
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

		System.out.println(Arrays.toString(arr));
	}

	/*
	 * efficient approach
	 */
	public static void sort2(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swaping
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

		System.out.println(Arrays.toString(arr));
	}

	/*
	 * more efficient solution
	 */
	public static void sort3(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swaping
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (flag = false)
				break;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 60, 90 };

		System.out.println(Arrays.toString(arr));

		sort3(arr);
	}

}
