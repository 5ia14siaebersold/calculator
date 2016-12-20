package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.bbw.Calculator;

public class TestCalculator {
	
	 Calculator calc;
	   
	   @Test
	   public void testAddition()
	   {
		   calc = new Calculator();      
	      assertTrue(calc.addition(10, 25) == 35);
	   }
}