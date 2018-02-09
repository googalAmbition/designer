package com.ambition.creational.simpleFactory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static String getBrand() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/com/ambition/creational/simpleFactory/config.xml"));
			
			NodeList nl = doc.getElementsByTagName("brand");
			Node classNode = nl.item(0).getFirstChild();
			String brand = classNode.getNodeValue().trim();
			return brand;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		System.err.println(getBrand());
	}
}
