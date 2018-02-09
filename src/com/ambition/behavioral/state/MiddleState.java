package com.ambition.behavioral.state;

public class MiddleState extends AbstractState {

	public MiddleState(AbstractState state) {
		this.acc =state.acc;
		this.point = state.point;
		this.ststeName = "middle";
	}

	@Override
	public void writeNote(int score) {
		System.out.println(acc.getName()+" writeNote,add "+score+"*2 score");
		this.point +=score*2;
		checkState(score);
		System.out.println("residue "+ this.point+", state is "+this.ststeName);
	}


	@Override
	public void checkState(int score) {
		if (point>=1000) {
			acc.setState(new HighState(this));
		}else if (point<0) {
			System.out.println("residue is insufficient, download failure");
			this.point += score;
		}
		else if (point<=100) {
			acc.setState(new PrimaryState(this));
		}
	}

}
