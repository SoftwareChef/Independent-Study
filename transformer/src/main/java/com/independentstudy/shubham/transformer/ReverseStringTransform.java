package com.independentstudy.shubham.transformer;

public class ReverseStringTransform {
	
	/*
	* Method to reverse a given string 
	*/
	public String forwardTransform(String input) {
		String reversedString = "";
		for (int i = input.length(); i > 0; i--) {
			reversedString += input.charAt(i - 1);
		}
		return reversedString;
	 }
	 
	 /*
	 * Method to reverse a given string 
	 */
	 public String reverseTransform(String input) {
		 return forwardTransform(input);
     }

}
