package com.sairam;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello");
		
		checkStatus();
	}

	private static void checkStatus() {
		String name=pinName();
		System.out.println(name);

		
	}

	private static String pinName() {
		System.out.println("check done");
		
		return "pin generated";
	}

}
