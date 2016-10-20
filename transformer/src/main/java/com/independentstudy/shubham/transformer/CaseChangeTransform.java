package com.independentstudy.shubham.transformer;

public class CaseChangeTransform {

	public String forwardTransform(String input) {
		StringBuilder strb = new StringBuilder();
		for (char c: input.toCharArray())
		{
			if (c >= 'a' && c <='z')
			{
				strb.append((char)(c-32));
			}
			else if (c >= 'A' && c <='Z')
			{
				strb.append((char)(c+32));
			}
			else
			{
				strb.append(c);	
			}
		}
		return strb.toString();
	}
	
	public String reverseTransform(String input) {
		return forwardTransform(input);
	}
}
