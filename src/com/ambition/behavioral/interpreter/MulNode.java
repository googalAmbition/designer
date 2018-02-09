package com.ambition.behavioral.interpreter;

public class MulNode extends SymbolNode {

	public MulNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int intepret() {
		return super.left.intepret() * super.right.intepret();
	}

}
