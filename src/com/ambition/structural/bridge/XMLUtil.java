package com.ambition.structural.bridge;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getObject(String args) {
		try {
			//创建文档
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/com/ambition/structural/bridge/config.xml"));
			
			NodeList nl = null;
			Node classNode = null;
			String cName = null;
			nl = doc.getElementsByTagName("className");
			if (args.equals("color")) {
				//获取包含类名的文本节点
				classNode = nl.item(0).getFirstChild();
			}
			else if (args.equals("pen")) {
				//获取包含类名的文本节点
				classNode = nl.item(1).getFirstChild();
			}
			//
			cName = classNode.getNodeValue();
			Class<?> c = Class.forName(cName);
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
