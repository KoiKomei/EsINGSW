package it.unical.calculator;

public class Division extends Operation{

	public Division(int firstOperand, int secondOperand) {
		super(firstOperand, secondOperand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int execute() {
		
		return getFirstOperand()/getSecondOperand();
	}

}
