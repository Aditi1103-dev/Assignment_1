package com.kpmg.basics;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "welcome to carretumer", str2 = "Welcome to Carretumer";
CharSequence cs = "welcome to carretumer";
System.out.println("Comparing" +str1+" and "+cs+": " +str1.contentEquals(cs));
System.out.println("Comparing" +str2+" and "+cs+": " +str2.contentEquals(cs));
	}

}
