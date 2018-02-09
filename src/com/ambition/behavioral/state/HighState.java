package com.ambition.behavioral.state;

public class HighState extends AbstractState {

	public HighState(AbstractState state) {
		this.acc = state.acc;
		this.point = state.getPoint();
		this.ststeName = "expert";

	}

	public void writeNote(int score) {
		System.out.println(acc.getName() + " writeNote,add " + score + "*2 score");
		this.point += score * 2;
		checkState(score);
		System.out.println("residue " + this.point + ", state is " + this.ststeName);
	}

	@Override
	public void downloadFile(int score) {
		System.out.println(acc.getName() + " download,subtract " + score + "/2 score");
		this.point -= score / 2;
		checkState(score);
		System.out.println("residue " + this.point + ", state is " + this.ststeName);
	}

	@Override
	public void checkState(int score) {
		if (point < 0) {
			System.out.println("residue is insufficient, download failure");
			this.point += score;
		} else if (point < 100) {
			acc.setState(new PrimaryState(this));
		} else if (point <= 1000) {
			acc.setState(new MiddleState(this));
		}
	}

}
