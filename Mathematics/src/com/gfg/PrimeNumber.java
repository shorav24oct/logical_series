package com.gfg;

public class PrimeNumber {

	static int count = 0;

	/*
	 * naive solution time complexity Big-O(n)
	 */
	public static boolean isPrime(int no) {
		if (no == 1)
			return false;

		for (int i = 2; i < no; i++) {
			count++;
			if (no % i == 0)
				return false;
		}

		return true;
	}

	/*
	 * efficient solution time complexity Big-O(/``n)
	 */
	public static boolean isPrime2(int no) {
		if (no == 1)
			return false;

		for (int i = 2; i * i <= no; i++) {
			count++;
			if (no % i == 0)
				return false;
		}

		return true;
	}

	/*
	 * more efficient solution
	 */
	public static boolean isPrimeOrNot(int no) {
		if (no == 1)
			return false;

		if (no == 2 || no == 3)
			return true;

		if (no % 2 == 0 || no % 3 == 0)
			return false;

		for (int i = 5; i * i <= no; i = i + 6) {
			count++;
			if (no % i == 0 || no % (i + 2) == 0)
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		System.out.println("Number is prime or not: " + isPrimeOrNot(1031));
		System.out.println(count);
	}

}
