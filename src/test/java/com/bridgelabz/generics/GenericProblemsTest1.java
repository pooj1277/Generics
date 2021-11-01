package com.bridgelabz.generics;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GenericProblemsTest1 {
	@Test
	public void testFindIntMaxTC1() {
		GenericProblems<Integer> generic = new GenericProblems<>(60, 25, 51);
		int result = (int) generic.findMax();
		assertEquals(60, result);
	}

	@Test
	public void testFindIntMaxTC2() {
		GenericProblems<Integer> generic = new GenericProblems<>(22, 60, 35);
		int result = (int) generic.findMax();
		assertEquals(60, result);
	}

	@Test
	public void testFindIntMaxTC3() {
		GenericProblems<Integer> generic = new GenericProblems<>(50, 12, 60);
		int result = (int) generic.findMax();
		assertEquals(60, result);
	}
}
