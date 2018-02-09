package com.ambition.behavioral.state;

public abstract class AbstractState {
	protected ForumAccount acc;
	protected int point;
	protected String ststeName;

	public abstract void checkState(int score);

	public void writeNote(int score) {
		System.out.println(acc.getName()+" release,plus "+score+" score");
		this.point += score;
		checkState(score);
		System.out.println("residue "+ this.point+", state is "+this.ststeName);
	}

	public void downloadFile(int score) {
		System.out.println(acc.getName()+" download,subtract "+score+" score");
		this.point -= score;
		checkState(score);
		System.out.println("residue "+ this.point+", state is "+this.ststeName);
	}

	public void replyNote(int score) {
		System.out.println(acc.getName()+" reply,plus "+score+" score");
		this.point += score;
		checkState(score);
		System.out.println("residue "+ this.point+", state is "+this.ststeName);
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getStsteName() {
		return ststeName;
	}

	public void setStsteName(String ststeName) {
		this.ststeName = ststeName;
	}
	
}
