package it.unical.tests;

import static org.junit.jupiter.api.Assert.assertTrue;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.runner.RunWith;
import org.junit.jupiter.api.runners.Parameterized;
import org.junit.jupiter.api.runners.Parameterized.Parameters;

import it.unical.calculator.*;

@RunWith(value=Parameterized.class)
class Parametric {

	private int number;
	
	public Parametric(int number) {
		this.number=number;
	}
	
	@ParameterizedTest
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
