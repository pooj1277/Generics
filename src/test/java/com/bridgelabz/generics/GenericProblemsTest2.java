package com.bridgelabz.generics;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GenericProblemsTest2 {
	@Test
	public void testFindFloatMaxTC1() {
		GenericProblems<Float> generic = new GenericProblems<>(60.10f, 20.20f, 45.25f);
		float result = generic.findMax();
		assertEquals(60.10f, result, 60.10f);
	}

	@Test
	public void testFindFloatMaxTC2() {
		GenericProblems<Float> generic = new GenericProblems<>(20.20f, 60.10f, 45.25f);
		float result = generic.findMax();
		assertEquals(60.10, result, 60.10f);
	}

	@Test
	public void testFindFloatMaxTC3() {
		GenericProblems<Float> generic = new GenericProblems<>(30.20f, 25.15f, 60.10f);
		float result = generic.findMax();
		assertEquals(60.10, result, 60.10f);
	}
}
