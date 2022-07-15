package com.gfg.recursion;

public class Print1toN {

	public static void function(int no) {
		if (no == 0)
			return;
		function(no - 1);
		System.out.println(no);
	}

	public static void main(String[] args) {
		function(8);
	}

}
