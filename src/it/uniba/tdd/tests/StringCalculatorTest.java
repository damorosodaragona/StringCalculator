package it.uniba.tdd.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniba.tdd.StringCalculator;
import it.uniba.tdd.StringCalculatorException;

public class StringCalculatorTest {

	@Test
	public void CalculatorForEmptyString() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(0, str.add(""));
	}
	
	@Test
	public void CalculatorForStringWithNumber1() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(1, str.add("1"));
	}
	
	@Test
	public void CalculatorForStringWithNumber1and2() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(3, str.add("1,2"));
	}
	
	@Test
	public void CalculatorForStringWithNumber3and4() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(7, str.add("3,4"));
	}
	
	@Test
	public void CalculatorForStringWith3Numbers() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(12, str.add("3,4,5"));
	}
	
	@Test
	public void CalculatorForStringWith4Numbers() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(18, str.add("3,4,5,6"));
	}
	
	@Test
	public void CalculatorForStringWith10Numbers() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(43, str.add("3,4,5,6,7,8,9,1,0"));
	}
	
	@Test
	public void CalculatorForStringWithSeparators() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(7, str.add("3\n4"));
	}
	
	@Test(expected = StringCalculatorException.class)
	public void CalculatorForStringWithIllegalSeparators() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(7, str.add("3,\n4"));
	}
	
	@Test
	public void CalculatorForStringWithSeparatorsAndMoreNumbers() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(22, str.add("3\n4,5\n9,1"));
	}
	
	@Test
	public void CalculatorForStringWithNewSeparators() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(22, str.add("//;\n3;4;5;9;1"));
	}
	
	@Test(expected = StringCalculatorException.class)
	public void CalculatorForStringWithIllegalNewSeparators() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(7, str.add("//;\n3;4,1"));
	}
	
	@Test(expected = StringCalculatorException.class)
	public void CalculatorForStringWithNegativeNumbers() throws StringCalculatorException {
		StringCalculator str = new StringCalculator();
		assertEquals(7, str.add("//;\n3;4,-1"));
	}

}
