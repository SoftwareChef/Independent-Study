package com.independentstudy.shubham.transformer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTransformTest {

	@Test
	  public void reverseTransformTest() {
	    ReverseStringTransform reverseStringTransform = new ReverseStringTransform();
	    assertEquals("abcd", reverseStringTransform.reverseTransform("dcba"));
	    assertEquals("1234", reverseStringTransform.reverseTransform("4321"));
	    assertEquals("+@#$", reverseStringTransform.reverseTransform("$#@+"));
	    assertEquals("12#$56", reverseStringTransform.reverseTransform("65$#21"));
	    assertEquals("   ", reverseStringTransform.reverseTransform("   "));
	    assertEquals("  S  ", reverseStringTransform.reverseTransform("  S  "));
	    assertEquals("?uoy era woh iH", reverseStringTransform.reverseTransform("Hi how are you?"));
	    assertEquals("hHH", reverseStringTransform.reverseTransform("HHh"));
	    assertEquals("!   ", reverseStringTransform.reverseTransform("   !"));
	  }

	  @Test
	  public void forwardTransformTest() {
	    ReverseStringTransform reverseStringTransform = new ReverseStringTransform();
	    assertEquals("dcba", reverseStringTransform.forwardTransform("abcd"));
	    assertEquals("4321", reverseStringTransform.reverseTransform("1234"));
	    assertEquals("$#@+", reverseStringTransform.reverseTransform("+@#$"));
	    assertEquals("65$#21", reverseStringTransform.reverseTransform("12#$56"));
	    assertEquals(" 65$#21", reverseStringTransform.reverseTransform("12#$56 ")); 
	    assertEquals("   ", reverseStringTransform.reverseTransform("   "));
	    assertEquals("  S  ", reverseStringTransform.reverseTransform("  S  "));
	    assertEquals("Hi how are you?", reverseStringTransform.reverseTransform("?uoy era woh iH"));
	    assertEquals("HHh", reverseStringTransform.reverseTransform("hHH"));
	    assertEquals("/   ", reverseStringTransform.reverseTransform("   /"));
	  }

}
