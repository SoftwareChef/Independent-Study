/**
 * 
 */
package com.independentstudy.shubham.transformer;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Shubham Mahajan
 *
 */
public class CaseChangeTransformTest {

	@Test
	public void testForwardTransform() {
		CaseChangeTransform cct = new CaseChangeTransform();
		assertEquals("shubhAM", cct.forwardTransform("SHUBHam"));
		assertEquals("4", cct.forwardTransform("4"));
		assertEquals("4ab", cct.forwardTransform("4AB"));
		assertEquals("4EVER", cct.forwardTransform("4ever"));
		assertEquals("4ever", cct.forwardTransform("4EVER"));
		assertEquals("EVER", cct.forwardTransform("ever"));
		assertEquals("shubham", cct.forwardTransform("SHUBHAM"));
		assertEquals("SHUBHAM", cct.forwardTransform("shubham"));
	}
	@Test
	public void testReverseTransform() {
		CaseChangeTransform cct = new CaseChangeTransform();
		assertEquals("shubhAM", cct.forwardTransform("SHUBHam"));
		assertEquals("4", cct.forwardTransform("4"));
		assertEquals("4ab", cct.forwardTransform("4AB"));
		assertEquals("4EVER", cct.forwardTransform("4ever"));
		assertEquals("4ever", cct.forwardTransform("4EVER"));
		assertEquals("EVER", cct.forwardTransform("ever"));
		assertEquals("shubham", cct.forwardTransform("SHUBHAM"));
		assertEquals("SHUBHAM", cct.forwardTransform("shubham"));
	}

}
