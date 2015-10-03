package gg.rouleur.calculator.processor;

import gg.rouleur.calculator.model.Node;
import gg.rouleur.calculator.operators.BinaryOperator;
import gg.rouleur.calculator.value.Number;

import java.util.List;
import java.util.Stack;

public class RPNProcessor {

	public Stack<Node> process (List<Node> output) {

		Stack<Node> operatorStack = new Stack<Node> ();
		for (Node node : output) {
			if (node instanceof BinaryOperator) {
				((BinaryOperator) node).setRight (operatorStack.pop ());
				((BinaryOperator) node).setLeft (operatorStack.pop ());
				operatorStack.push (new Number (node.value ()));
			} else {
				operatorStack.push (node);
			}
		}
		return operatorStack;
	}

}
