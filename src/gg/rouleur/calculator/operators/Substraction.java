package gg.rouleur.calculator.operators;


public class Substraction extends BinaryOperator {

	@Override
	public Double value () {
		return left.value () - right.value ();
	}
}
