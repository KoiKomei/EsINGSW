package it.unical.calculator;

public class Subtraction extends Operation{

	public Subtraction(int firstOperand, int secondOperand) {
		super(firstOperand, secondOperand);
	}

	@Override
	public int execute() {
		return getFirstOperand()-getSecondOperand();
	}

	
	
}
