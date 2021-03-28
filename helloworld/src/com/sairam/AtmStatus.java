package com.sairam;

public class AtmStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String branchName="Martur";
		String status=checkAtmStatus(branchName);
		System.out.println(status);

	}

	private static String checkAtmStatus(String branchName) {
		System.out.println("branchname");
		return getStatus(branchName);
	}

	private static String getStatus(String branchName) {
		System.out.println("getStatus");
		return "Success";
	}

}
