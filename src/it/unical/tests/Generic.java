package it.unical.tests;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assert.assertEquals;

import static org.junit.jupiter.api.After;
import static org.junit.jupiter.api.Before;
import static org.junit.jupiter.api.BeforeClass;
import org.junit.jupiter.api.Test;


import it.unical.calculator.*;

class Generic {
	int i;
	int j;
	
	@BeforeEach
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
		Division div= new Division(j,2);
		div.execute();
	}
	
	@AfterEach
	public void finalize() {
		i=0;
		j=0;
	}
	

}
