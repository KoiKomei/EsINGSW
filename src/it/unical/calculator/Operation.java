package it.unical.calculator;

public abstract class Operation {
	private int firstOperand=0;
	private int secondOperand=0;
	
	public Operation(int firstOperand, int secondOperand) {
			this.firstOperand=firstOperand;
			this.secondOperand=secondOperand;
		
	}
	
	public int getFirstOperand() {
			return firstOperand;
	}
	public int getSecondOperand() {
			return secondOperand;
	}
	
	public void setFirstOperand(int a) {
		this.firstOperand=a;		
	}
	
	public void setSecondOperand(int a) {
		this.secondOperand=a;
	}
	
	public abstract int execute();
}
