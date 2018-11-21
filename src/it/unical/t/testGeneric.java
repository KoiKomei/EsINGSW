package it.unical.t;


import static org.junit.Assert.assertEquals;

import  org.junit.After;
import  org.junit.Before;
import  org.junit.BeforeClass;
import org.junit.Test;


import it.unical.calculator.Division;
import it.unical.calculator.Sum;
import it.unical.calculator.Subtraction;
import it.unical.calculator.Multiply;
import it.unical.calculator.Operation;

public class testGeneric {
	int i;
	int j;
	
	@Before
	public void initializeTestCases() {
		Multiply molt=new Multiply(5,6);
		i=molt.execute();
		Division div= new Division(i,2);
		j=div.execute();
	}
	
	@Test
	public void sum2() {
		Sum calc=new Sum(j,2);
		assertEquals(calc.execute(), 17);
	}
	
	@Test
	public void divide5() {
		Division calc=new Division(j, 5);
		assertEquals(calc.execute(),3);
	}
	
	@Test
	public void multiply10() {
		Multiply calc=new Multiply(j,10);
		assertEquals(calc.execute(),150);
	}
	
	@Test(expected=ArithmeticException.class)
	public void divisionByZero() {
		Division div= new Division(j,0);
		div.execute();
	}
	
	@After
	public void finalize() {
		i=0;
		j=0;
	}
	

}
