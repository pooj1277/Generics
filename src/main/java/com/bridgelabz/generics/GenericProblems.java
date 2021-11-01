package com.bridgelabz.generics;

public class GenericProblems< t extends Comparable<t> > {	
	t input1, input2, input3;
	
	public GenericProblems(t inputOne, t inputTwo, t inputThree) {
		this.input1 = inputOne;
		this.input2 = inputTwo;
		this.input3 = inputThree;
	}
	
	public t findMax() {
		return GenericProblems.findMax(input1, input2, input3);
	}
	public static <t extends Comparable<t>> t findMax(t inputOne, t inputTwo, t inputThree) {
		t max = inputOne;
		if (inputTwo.compareTo(max) > 0)
			max = inputTwo;
		if (inputThree.compareTo(max) > 0)
			max = inputThree;
		return max;
	}
}