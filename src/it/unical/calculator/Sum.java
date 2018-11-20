package it.unical.calculator;

public class Sum extends Operation{

	public Sum(int firstOperand, int secondOperand) {
		super(firstOperand, secondOperand);
	
	}

	@Override
	public int execute() {
		
		return getFirstOperand()+getSecondOperand();
	}

}
