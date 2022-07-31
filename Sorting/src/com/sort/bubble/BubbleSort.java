package com.sort.bubble;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 80, 20, 60, 90, 50, 40 };

		System.out.println(Arrays.toString(arr));

		sort(arr);
	}

}
