package com.ambition.structural.bridge;

public class BigPen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "BigPen draw ";
		this.color.bepaint(penType, name);
	}

}
