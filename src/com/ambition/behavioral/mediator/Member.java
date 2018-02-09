package com.ambition.behavioral.mediator;

public abstract class Member {

	public String getName() {
		return name;
	}

	protected AbstractChartroom chartroom;
	protected String name;

	public abstract void sendText(String to, String message);

	public abstract void sendImage(String to, String image);

	public void receiveText(String from, String message) {
		System.out.println(from + " send to " + this.name + " " + message);
	}

	public void receiveImage(String from, String image) {
		System.out.println(from + " send to " + this.name + " " + image);
	}

	public Member(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AbstractChartroom getChartroom() {
		return chartroom;
	}

	public void setChartroom(AbstractChartroom chartroom) {
		this.chartroom = chartroom;
	}

}
