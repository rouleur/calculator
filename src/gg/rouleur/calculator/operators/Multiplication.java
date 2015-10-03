package gg.rouleur.calculator.operators;


public class Multiplication extends BinaryOperator implements HighPrecedenceOperator {

	@Override
	public Double value () {
		return left.value () * right.value ();
	}
	
}
