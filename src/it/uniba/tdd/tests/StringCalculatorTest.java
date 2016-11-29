package it.uniba.tdd.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniba.tdd.StringCalculator;

public class StringCalculatorTest {

	@Test
	public void CalculatorForEmptyString() {
		StringCalculator str = new StringCalculator();
		assertEquals(0, str.add(""));
	}
	
	@Test
	public void CalculatorForStringWithNumber1() {
		StringCalculator str = new StringCalculator();
		assertEquals(1, str.add("1"));
	}
	
	@Test
	public void CalculatorForStringWithNumber1and2() {
		StringCalculator str = new StringCalculator();
		assertEquals(3, str.add("1,2"));
	}
	
	@Test
	public void CalculatorForStringWithNumber3and4() {
		StringCalculator str = new StringCalculator();
		assertEquals(7, str.add("3,4"));
	}

}
