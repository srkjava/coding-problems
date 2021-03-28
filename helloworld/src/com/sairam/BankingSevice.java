package com.sairam;

public class BankingSevice {

	public static void main(String[] args) {
		System.out.println("iciciatm");
		checkstatus();

	}

	private static void checkstatus() {
		String atmName = "iciciatm";
		String name = checkstatus(atmName);
		System.out.println("name" + name);
	}

	private static String checkstatus(String atmName) {
		// TODO Auto-generated method stub
		return atmName;
	}

}
