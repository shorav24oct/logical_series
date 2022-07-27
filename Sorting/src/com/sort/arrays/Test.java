package com.sort.arrays;

import java.util.Arrays;

class Point implements Comparable<Point> {

	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		return this.x - o.x;
	}

}

public class Test {

	public static void main(String[] args) {
		Point[] arr = { new Point(10, 20), new Point(5, 25), new Point(8, 80), new Point(1, 10) };
		
		for (int i = 0; i < arr.length; i++)
			System.out.print("(" + arr[i].x + "," + arr[i].y + ") ");
		System.out.println();
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++)
			System.out.print("(" + arr[i].x + "," + arr[i].y + ") ");
	}

}
