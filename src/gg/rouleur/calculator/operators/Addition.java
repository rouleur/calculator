package gg.rouleur.calculator.operators;


public class Addition extends BinaryOperator {

	@Override
	public Double value () {
		return this.left.value () + right.value ();
	}
}
