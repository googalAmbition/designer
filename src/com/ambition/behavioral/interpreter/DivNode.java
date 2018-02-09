package com.ambition.behavioral.interpreter;

public class DivNode extends SymbolNode {

	public DivNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int intepret() {
		return super.left.intepret()/super.right.intepret();
	}

}
