package web;

import java.util.List;

import javax.lang.model.util.Elements;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class Dom4j {
	public static void main(String[] args) throws DocumentException {
		selectName();
	}
	
	
	public static void selectName() throws DocumentException {
		SAXReader saxReader = new SAXReader();
		
		Document document = saxReader.read("src/test.xml");
		
		Element root = document.getRootElement();
		
		List<Element> list = root.elements("p1");
		
		for(Element e : list) {
			Element name1 = e.element("name");
			String s = name1.getText();
			System.out.println(s);
		}
	}
}
