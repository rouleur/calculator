package gg.rouleur.calculator;

import gg.rouleur.calculator.model.Node;
import gg.rouleur.calculator.parsers.InputParser;
import gg.rouleur.calculator.parsers.ShuntingYardParser;
import gg.rouleur.calculator.processor.RPNProcessor;

import java.util.List;
import java.util.Stack;

public class Main {

	static class Calculator {

		private InputParser parser;

		private RPNProcessor rpnProcessor;

		public Calculator (InputParser parser, RPNProcessor rpnProcessor) {
			super ();
			this.parser = parser;
			this.rpnProcessor = rpnProcessor;
		}

		public Double calculate (String input) {
			List<Node> output = parser.parseInput (input);
			Stack<Node> operatorStack = rpnProcessor.process (output);
			return operatorStack.pop ().value ();
		}

	}

	public static void main (String[] args) {
		Calculator cal =
			new Calculator (new ShuntingYardParser (), new RPNProcessor ());
		String input = "3+4*2";
		assert 11.0 == cal.calculate (input);

	}

}
