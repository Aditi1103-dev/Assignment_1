package com.kpmg.basics;

public class Exercise_6{

	private static String inputString;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		for(int i=0; i<inputString.length(); i++) {
			char character = inputString.charAt(i);
			if
			(Character.isUpperCase(character)) {
				System.out.print(character + " ");
			}
		}

	}

	public static void main1(String[] args) {
		String inputString = "Hello World";
		System.out.println("Capital letters in the string:");
		printCapitalLetters(inputString);
	}

	private static void printCapitalLetters(String inputString2) {
		// TODO Auto-generated method stub
		
	}

}