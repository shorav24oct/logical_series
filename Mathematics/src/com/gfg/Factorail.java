package com.gfg;

import java.util.Scanner;

public class Factorail {

	public static int factorial(int no) {
		if (no == 1)
			return 1;

		int fact = 1;
		while (no > 0) {
			fact = fact * no;
			no--;
		}
		return fact;

	}

	public static int factorailForLoop(int no) {
		int fact = 1;
		for (int i = 2; i <= no; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter no for you which find factorial");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		System.out.println("Factorial of " + no + " : " + factorailForLoop(no));
	}

}
