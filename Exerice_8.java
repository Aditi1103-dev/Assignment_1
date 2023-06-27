package com.kpmg.basics;

public class Exerice_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String convertSecondOccurrence(String inputString, char character) {
			int firstOccurrenceIndex = inputString.indexOf(character);
			int secondOccurrenceIndex = inputString.indexOf(character,firstOccurrenceIndex + 1);
			if (secondOccurrenceIndex != -1) {
				String beforeSecondOccurrence = inputString.substring(0, secondOccurrenceIndex);
				String afterSecondOccurrence = inputString.substring(secondOccurrenceIndex + 1);
				return;
			}
			return;
			
			}
		public static void main(String[] args1) {
			String inputString1 = "bvrit college";
			char character1 = 'l';
			String convertedString = convertSecondOccurrence(inputString1,character1);
			System.out.println("Converted string: +convertedString");
		}

	}

	private static String convertSecondOccurrence(String inputString1, char character1) {
		// TODO Auto-generated method stub
		return null;
	}

}
