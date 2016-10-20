package com.independentstudy.shubham.transformer;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterShiftTransformTest {

	@Test
	public void testForwardTransform() {
		CharacterShiftTransform characterShiftTransform = new CharacterShiftTransform();
		assertEquals("", characterShiftTransform.forwardTransform(""));
		assertEquals("182!563+=", characterShiftTransform.forwardTransform("182!563+="));
		assertEquals("BCdeFg1230YzA-1278amnoPq", characterShiftTransform.forwardTransform("ABcdEf1230XyZ-1278zlmnOp"));
	}
	
	//@Test
	public void testReverseTransform() {
		CharacterShiftTransform characterShiftTransform = new CharacterShiftTransform();
		assertEquals("", characterShiftTransform.reverseTransform(""));
		assertEquals("182!563+=", characterShiftTransform.reverseTransform("182!563+="));
		assertEquals("ABcdEf1230XyZ-1278zlmnOp", characterShiftTransform.reverseTransform("BCdeFg1230YzA-1278amnoPq"));
	}

}
