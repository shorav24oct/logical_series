package com.gfg;

public class Palindrome {

	public static boolean isPalindrome(int no) {
		int temp = no;
		int reverse = 0;

		while (temp > 0) {
			int rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp = temp / 10;
		}
		return (no == reverse);
	}

	public static void main(String[] args) {
		System.out.println("Is palindrome : " + isPalindrome(181));
	}

}
