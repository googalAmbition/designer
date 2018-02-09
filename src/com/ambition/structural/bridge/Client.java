package com.ambition.structural.bridge;

public class Client {
	public static void main(String[] args) {
		Color color;
		Pen pen;
		color = (Color) XMLUtil.getObject("color");
		pen = (Pen) XMLUtil.getObject("pen");
		
		pen.setColor(color);
		pen.draw(" flowers");
	}
}
