package com.kpmg.basics;

public class Exercise_7 {

	private static String mainString;
	private static Object endingString;
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		String endingString;
		if(mainString.length() < endingString.length()) {
			return;
		}
		int startingIndex = mainString.length()-endingString.length();
		for(int i=0; i<endingString.length();i++) {
			if(mainString.charAt(startingIndex +i)!=endingString.charAt(i)) {
				return;
				
			}
		}
		return;

	}
	public static void main(String[] args) {
		String mainString = "Hello, World!";
		boolean endsWithEndingString = endsWith(mainString,endingString);
		if(endsWithEndingString) {
			System.out.println("The main string ends with the ending string");
		}
		else {
			System.out.println("The main string does not end with the ending string");
		}
	}
	private static boolean endsWith(String mainString2, Object endingString2) {
		// TODO Auto-generated method stub
		return false;
	}

		
	}


