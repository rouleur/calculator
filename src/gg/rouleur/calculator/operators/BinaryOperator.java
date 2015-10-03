package gg.rouleur.calculator.operators;

import gg.rouleur.calculator.model.Node;

public abstract class BinaryOperator extends Node {

	Node left;

	Node right;

	public Node getLeft () {
		return left;
	}

	public void setLeft (Node left) {
		this.left = left;
	}

	public Node getRight () {
		return right;
	}

	public void setRight (Node right) {
		this.right = right;
	}

}
