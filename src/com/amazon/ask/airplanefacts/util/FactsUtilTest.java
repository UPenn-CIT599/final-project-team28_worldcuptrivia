package com.amazon.ask.airplanefacts.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactsUtilTest {

	@Test
	void testGetFactMap() {
		FactsUtil fu = new FactsUtil();
		Integer length = fu.getFactMap().size();
		assertEquals(5, length);
		// We should have 5 facts
	}

}
