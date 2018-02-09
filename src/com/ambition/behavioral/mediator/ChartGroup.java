package com.ambition.behavioral.mediator;

import java.util.Hashtable;

public class ChartGroup extends AbstractChartroom{

	private Hashtable<String, Member> members = new Hashtable<String, Member>();
	
	@Override
	public void register(Member member) {
		if (!members.contains(member)) {
			members.put(member.getName(),member);
			member.setChartroom(this);
		}
	}

	@Override
	public void sendText(String from, String to, String message) {
		Member member = members.get(to);
		String newMesaage = message;
		newMesaage = message.replaceAll("sex", "***");
		member.receiveText(from, newMesaage);
	}

	@Override
	public void sendImage(String from, String to, String image) {
		Member member = members.get(to);
		if (image.length()>5) {
			System.out.println("image is too big!");
		}else {
			member.receiveImage(from, image);
		}
	}

}
