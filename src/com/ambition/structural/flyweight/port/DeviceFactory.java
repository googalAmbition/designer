package com.ambition.structural.flyweight.port;

import java.util.ArrayList;
import java.util.List;

public class DeviceFactory {
	private List<NetworkDevice> devices = new ArrayList<NetworkDevice>();
	private int totalTerminal = 0;
	
	public DeviceFactory() {
		NetworkDevice nd1 = new Switch("switch 1 ");
		devices.add(nd1);
		NetworkDevice nd2 = new Hub("hub 1");
		devices.add(nd2);
	}
	
	public NetworkDevice getNetworkDevice(String type) {
		if (type.equalsIgnoreCase("switch")) {
			totalTerminal++;
			return devices.get(0);
		}
		else if (type.equalsIgnoreCase("tp")) {
			totalTerminal++;
			return devices.get(1);
		}
		else {
			return null;
		}
	}

	public int getTotalDevice() {
		return devices.size();
	}
	
	public int getTotalTerminal() {
		return totalTerminal;
	}

	
	
}
