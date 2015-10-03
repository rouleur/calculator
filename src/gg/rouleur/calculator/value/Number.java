package gg.rouleur.calculator.value;

import gg.rouleur.calculator.model.Node;

public class Number extends Node {

	Double value;

	public Number (Double value) {
		super ();
		this.value = value;
	}

	public Double value () {
		return value;
	}

}
