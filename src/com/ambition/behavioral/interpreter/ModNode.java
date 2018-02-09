package com.ambition.behavioral.interpreter;

public class ModNode extends SymbolNode{

	public ModNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int intepret() {
		return super.left.intepret()%super.right.intepret();
	}

}
