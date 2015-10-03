package gg.rouleur.calculator.model;

import gg.rouleur.calculator.operators.Addition;
import gg.rouleur.calculator.operators.Division;
import gg.rouleur.calculator.operators.Multiplication;
import gg.rouleur.calculator.operators.Substraction;
import gg.rouleur.calculator.value.Number;

public class NodeFactory {

	public static Node createNode (char c) {
		Node node;
		switch (c) {
		case '+':
			node = new Addition ();
			break;
		case '-':
			node = new Substraction ();
			break;
		case '*':
			node = new Multiplication ();
			break;
		case '/':
			node = new Division ();
			break;
		default:
			node = new Number (Double.valueOf (Character.getNumericValue (c)));
			break;
		}
		return node;
	}
}
