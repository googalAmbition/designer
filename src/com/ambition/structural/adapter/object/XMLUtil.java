package com.ambition.structural.adapter.object;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getObject() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/com/ambition/structural/adapter/object/config.xml"));
			
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String brand = classNode.getNodeValue().trim();
			
			Class<?> c = Class.forName(brand);
			Object object = c.newInstance();
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void main(String[] args) {
//		System.err.println(getBrand());
	}
}
