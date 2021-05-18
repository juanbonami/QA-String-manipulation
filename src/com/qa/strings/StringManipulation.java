package com.qa.strings;

public class StringManipulation {
	
	 static String firstStr = "yesterday it was raining";
	 static String secondStr = "today it is sunny";
	
	 static String newStr = secondStr + ", " + firstStr;
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(newStr.toUpperCase()); // output: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
		
		System.out.println(newStr.toUpperCase().substring(0, 11) + " " + newStr.toUpperCase().substring(36, 43));
		// output: TODAY IT IS RAINING
	}

}
