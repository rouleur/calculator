package gg.rouleur.calculator.operators;


public class Division extends BinaryOperator implements HighPrecedenceOperator {

	@Override
	public Double value () {
		return left.value () / right.value ();
	}
}
