package it.unical.tests;
import static org.junit.jupiter.api.Assert.assertEquals;
import static org.junit.jupiter.api.Assert.assertFalse;
import static org.junit.jupiter.api.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import it.unical.calculator.*;

class TestCalcultor {

	@Test
	public void sum(){				
		Sum calc = new Sum(5, 9);
		assertEquals(14, calc.execute());
		
		calc.setSecondOperand(10);
		assertEquals(15, calc.execute());
		
		calc.setFirstOperand(6);
		assertTrue(calc.execute() == 16);
		assertFalse(calc.execute() < 16);
	}
	
	@Test
	public void subtraction(){				
		Subtraction calc = new Subtraction(10, 5);
		assertEquals(5, calc.execute());
		
		calc.setSecondOperand(10);
		assertEquals(0, calc.execute());
		
		calc.setFirstOperand(6);
		assertFalse(calc.execute() > 0);	
	}
	
	@Test
	public void multiplication(){				
		Multiply calc = new Multiply(5, 8);		
		assertEquals(40, calc.execute());
		
		calc.setSecondOperand(10);
		assertEquals(50, calc.execute());
		
		calc.setFirstOperand(6);
		assertTrue(calc.execute() > 0);	
	}
	
	@Test
	public void division(){				
		Division calc = new Division(10, 5);		
		assertEquals(2, calc.execute());
		
		calc.setSecondOperand(10);
		assertEquals(1, calc.execute());
		
		calc.setFirstOperand(6);		
		assertTrue(calc.execute() < 1);
	}

}
