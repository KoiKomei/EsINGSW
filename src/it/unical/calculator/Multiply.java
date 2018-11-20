package it.unical.calculator;

public class Multiply extends Operation{

	public Multiply(int firstOperand, int secondOperand) {
		super(firstOperand, secondOperand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int execute() {
		return getFirstOperand()*getSecondOperand();
	}

	
}
