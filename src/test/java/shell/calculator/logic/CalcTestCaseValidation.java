package shell.calculator.logic;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Ignore;

import junit.framework.Assert;

public class CalcTestCaseValidation {

	CalcSample calc;
	
	@Before
	public void thisIsBeforeAnnotation() {
		calc = new CalcSample();
	}
	
	@Ignore
	@Test
	public void validateAddition() {
		int expectedResult = 30;
		int actualResult = calc.addition(10, 20);
		org.junit.Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void validateSubtraction() {
		int expectedResult = 5;
		int actualResult = calc.subtraction(10, 5);
		org.junit.Assert.assertEquals(expectedResult, actualResult);
	}
	
	@After
	public void tearDown() {
		System.out.println("Testcase is completed.");
	}

}
