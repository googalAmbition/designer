package com.ambition.behavioral.state;


public class ForumAccount {
	private AbstractState state;
	private String name ;
	
	public ForumAccount(String name) {
		this.name = name;
		this.state = new PrimaryState(this);
		System.out.println(this.name+" regist success");
		System.out.println("----------------------");
	}
	
	public void writeNote(int score) {
		state.writeNote(score);
	}
	
	public void downloadFile(int score) {
		state.downloadFile(score);
	}
	
	public void replyNote(int score) {
		state.replyNote(score);
	}
	
	public AbstractState getState() {
		return state;
	}
	public void setState(AbstractState state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
