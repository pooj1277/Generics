package com.bridgelabz.generics;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GenericProblemsTest3 {
	@Test
	public void testFindStringMaxTC1() {
		GenericProblems<String> generic = new GenericProblems<>("Peach", "Apple", "Banana");
		String result = generic.findMax();
		assertEquals("Peach", result);
	}

	@Test
	public void testFindStringMaxTC2() {
		GenericProblems<String> generic = new GenericProblems<>("Apple", "Peach", "Banana");
		String result = generic.findMax();
		assertEquals("Peach", result);
	}

	@Test
	public void testFindStringMaxTC3() {
		GenericProblems<String> generic = new GenericProblems<>("Apple", "Banana", "Peach");
		String result = generic.findMax();
		assertEquals("Peach", result);
	}
}
