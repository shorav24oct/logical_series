package com.sort.arrays;

import java.util.Arrays;
import java.util.Comparator;

class MyComparator implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		return o1.x - o2.x;
	}

}

public class TestGFG {

	public static void main(String[] args) {
		Point[] arr = { new Point(10, 20), new Point(5, 25), new Point(8, 80), new Point(1, 10) };

		for (int i = 0; i < arr.length; i++)
			System.out.print("(" + arr[i].x + "," + arr[i].y + ") ");
		System.out.println();

		Arrays.sort(arr, new MyComparator());
		

		for (int i = 0; i < arr.length; i++)
			System.out.print("(" + arr[i].x + "," + arr[i].y + ") ");

	}

}
