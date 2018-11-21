package it.unical.t;


import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import it.unical.calculator.Division;
import it.unical.calculator.Sum;
import it.unical.calculator.Subtraction;
import it.unical.calculator.Multiply;
import it.unical.calculator.Operation;

@RunWith(value=Parameterized.class)
public class testParametric {

	private int number;
	
	public testParametric(int number) {
		this.number=number;
	}
	
	@Parameters
	public static Collection data() {
		Object[][] data=new Object[][] {{5},{10}, {20}, {40}};
		return Arrays.asList(data);
	}
	
	@Test
	public void test() {
		System.out.println("Test for "+number);
		if(number <15) {
			Division div= new Division(number, 5);
			int result=div.execute();
			assertTrue((result==1)||(result==2));
		}else {
			Multiply mult=new Multiply(number,2);
			int result=mult.execute();
			assertTrue((result==40)||(result==80));
			
		}
		
	}

}
/*import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
   private Integer inputNumber;
   private Boolean expectedResult;
   private PrimeNumberChecker primeNumberChecker;

   @Before
   public void initialize() {
      primeNumberChecker = new PrimeNumberChecker();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
	
   public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 2, true },
         { 6, false },
         { 19, true },
         { 22, false },
         { 23, true }
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + inputNumber);
      assertEquals(expectedResult, 
      primeNumberChecker.validate(inputNumber));
   }
}*/