package com.gfg;

public class PrimeNumber {

	/*
	 * naive solution
	 * time complexity Big-O(n)
	 */
	public static boolean isPrime(int no) {
		if (no == 1)
			return false;

		for (int i = 2; i < no; i++)
			if (no % i == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		System.out.println("Number is prime or not: " + isPrime(3));
	}

}
