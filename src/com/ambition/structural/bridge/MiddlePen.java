package com.ambition.structural.bridge;

public class MiddlePen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "MiddlePen draw ";
		this.color.bepaint(penType, name);
	}

}
