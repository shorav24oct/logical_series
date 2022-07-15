package com.gfg.recursion;

public class PrintNto1 {

	public static void function(int no) {
		if(no == 0)
			return;
		
		System.out.println(no);
		
		function(no - 1);
	}
	
	public static void main(String[] args) {
		function(5);
	}

}
