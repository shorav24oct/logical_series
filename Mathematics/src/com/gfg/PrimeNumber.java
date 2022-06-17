package com.gfg;

public class PrimeNumber {

	/*
	 * naive solution time complexity Big-O(n)
	 */
	public static boolean isPrime(int no) {
		if (no == 1)
			return false;

		for (int i = 2; i < no; i++)
			if (no % i == 0)
				return false;

		return true;
	}

	/*
	 * more efficient method
	 */
	public static boolean isPrimeOrNot(int no) {
		if (no == 1) 
			return false;

		if (no == 2 || no == 3)
			return true;
		
		if (no % 2 == 0 || no % 3 == 0)
			return false;
		
		for (int i = 5; i * i <= no; i = i + 6)
			if (no % i == 0 || no % (i+2) == 0)
				return false;
		
		return true;

	}

	public static void main(String[] args) {
		System.out.println("Number is prime or not: " + isPrimeOrNot(32));
	}

}
