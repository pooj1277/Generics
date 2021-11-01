package com.bridgelabz.generics;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GenericProblemsTest {

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