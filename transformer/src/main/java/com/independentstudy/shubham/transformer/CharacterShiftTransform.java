package com.independentstudy.shubham.transformer;

public class CharacterShiftTransform {
	
	// private static variables
	private static int CAP_A = 65;
	private static int CAP_Z = 90;
	private static int LOW_A = 97;
	private static int LOW_Z = 122;
	
	public String forwardTransform(String input) {
		return characterShiftTransform(input, false);
	}

	public String reverseTransform(String input) {
		return characterShiftTransform(input, true);
	}
	
	/** 
	 Method that actually performs the transformation.  
	 Accepts a string to be converted and a boolean value specifying if alphabetic characters 
	 are shifted forward (a->b->c, etc.) or reverse (c->b-c) 
	 
	 @param value string value to be transformed
	 @param reverse true or false (default) - if true, then alpha characters are shifted in reverse, otherwise, they shift forward.
	 @return 
	*/
	private final String characterShiftTransform(String value, boolean reverse) {
		String result = "";
		int multiplier = 0;
		byte[] asciiBytes = value.getBytes();
		int pointerShift = reverse ? - 1 : 1;
		for (int pointer = 0; pointer < asciiBytes.length; pointer++) {
			if (between(asciiBytes[pointer], CAP_A, CAP_Z) || between(asciiBytes[pointer], LOW_A, LOW_Z)) {
				multiplier = 1;
				if (contains(asciiBytes[pointer], CAP_A, CAP_Z, LOW_A, LOW_Z))
				{
					if (contains(asciiBytes[pointer], CAP_A, LOW_A, 0, 0)) {
						multiplier = reverse ? - 25 : 1;
					}
					if (contains(asciiBytes[pointer], CAP_Z, LOW_Z, 0, 0)) {
						multiplier = reverse ? 1 : -25;
					}
				}
				result += (char)(asciiBytes[pointer] + (pointerShift * multiplier));
			}
			else {
				result += (char)asciiBytes[pointer];
			}
		}
		return result;
	}
	
	/** 
	 This determines if a value falls between the low & high values specified
	 
	 @param num the numeric value being evaluated
	 @param low the low range value
	 @param high the high range value
	 @return 
	*/
	private final boolean between(int num, int low, int high) {
		return (low <= num && num <= high);
	}

	/** 
	 This method verifies if a specified value exists within the list of values specified (max 4 values).  
	 At least two values are required, additional two are optional.
	 
	 @param num the numeric value being evaluated
	 @param low (required) value 1
	 @param high (required) value 2
	 @param low2 (optional) value 3 - pass a zero to ignore
	 @param high2 (optional) value 4 - pass a zero to ignore
	 @return 
	*/
	private final boolean contains(int num, int low, int high, int low2, int high2) {
		java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>(java.util.Arrays.asList(new Integer[] {low, high, low2, high2}));
        return list.contains(num);
	}

}
