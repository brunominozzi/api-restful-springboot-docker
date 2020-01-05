package br.com.minozzi.math;

public class SimpleMath {
	
	public Double sum(Double numberOne, Double numberTwo) {
		Double sum = numberOne + numberTwo;
		return sum;
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {
		Double sum = numberOne - numberTwo;
		return sum;
	}
	
	public Double multiplication(Double numberOne, Double numberTwo) {
		Double sum = numberOne * numberTwo;
		return sum;
	}
	
	public Double division(Double numberOne, Double numberTwo) {
		Double sum = numberOne / numberTwo;
		return sum;
	}
	
	public Double mean(Double numberOne, Double numberTwo) {
		Double sum = (numberOne + numberTwo)/2;
		return sum;
	}
	
	public Double squareRoot(Double number) {
		Double sum = Math.sqrt(number);
		return sum;
	}

}
