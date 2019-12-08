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
	
	@Test
	void testGetImageMap() {
		FactsUtil fu = new FactsUtil();
		Integer length = fu.getImageMap().size();
		assertEquals(5, length);
		// We should have 5 images
	}
	
	@Test
	void testGetKeys() {
		FactsUtil fu = new FactsUtil();
		Integer length = fu.getKeys().size();
		assertEquals(5, length);
		// We should have 5 keys
	}

}
