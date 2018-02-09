package com.ambition.structural.flyweight.port;


public class Client {
	public static void main(String[] args) {
		NetworkDevice nd1,nd2,nd3,nd4,nd5;
		DeviceFactory df = new DeviceFactory();
		
		nd1 = df.getNetworkDevice("switch");
		nd1.use(new Port("1001"));
		
		nd2 = df.getNetworkDevice("switch");
		nd2.use(new Port("1002"));
		
		nd3 = df.getNetworkDevice("switch");
		nd3.use(new Port("1003"));
		
		nd4 = df.getNetworkDevice("tp");
		nd4.use(new Port("1004"));
		
		nd5 = df.getNetworkDevice("tp");
		nd5.use(new Port("1005"));
		
		System.out.println("totalDevice : " + df.getTotalDevice());
		System.out.println("totalTerminal : " + df.getTotalTerminal());
	}
}
