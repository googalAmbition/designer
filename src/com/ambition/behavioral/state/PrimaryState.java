package com.ambition.behavioral.state;

public class PrimaryState extends AbstractState {

	public PrimaryState(AbstractState state) {
		this.acc = state.acc;
		this.point = state.point;
		this.ststeName = "Newer";
	}

	public PrimaryState(ForumAccount acc) {
		this.point = 0;
		this.acc = acc;
		this.ststeName = "Newer";
	}

	public void downloadFile(int score) {
		System.out.println("sorry "+acc.getName()+" can't download");
	}
	@Override
	public void checkState(int score) {
		if (point>=1000) {
			acc.setState(new HighState(this));
		}
//		else if (point<0) {
//			System.out.println("residue is insufficient");
//			this.point += point;
//		}
		else if (point>=100) {
			acc.setState(new MiddleState(this));
		}
	}
}
