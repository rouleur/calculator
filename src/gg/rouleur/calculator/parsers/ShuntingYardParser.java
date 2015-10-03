package gg.rouleur.calculator.parsers;

import gg.rouleur.calculator.model.Node;
import gg.rouleur.calculator.model.NodeFactory;
import gg.rouleur.calculator.operators.BinaryOperator;
import gg.rouleur.calculator.operators.HighPrecedenceOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ShuntingYardParser implements InputParser {

	/**
	 * A very minimal version of the
	 * Shunting Yard Algorithm to transform the input to RPN
	 * 
	 * @param input
	 * @return A list of {@link Node}s representing RPN
	 */
	public List<Node> parseInput (String input) {
		Stack<Node> operatorStack = new Stack<Node> ();
		List<Node> output = new ArrayList<Node> ();
		char[] charArray = input.toCharArray ();
		for (int i = 0; i < charArray.length; i++) {
			Node node = NodeFactory.createNode (charArray[i]);
			if (node instanceof BinaryOperator) {
				operatorStack.push (node);
			} else {
				output.add (node);
				if (operatorStack.size () > 0
					&& operatorStack.lastElement () instanceof HighPrecedenceOperator)
					output.add (operatorStack.pop ());
			}
		}
		while (!operatorStack.isEmpty ()) {
			output.add (operatorStack.pop ());
		}
		return output;
	}

}
