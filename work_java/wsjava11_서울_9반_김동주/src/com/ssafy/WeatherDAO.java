package com.ssafy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class WeatherDAO {
	private List<Weather> list;
	private static WeatherDAO instance;
	static Document doc;
	int hour;
	double temp;
	String wfKor;
	int reh;
	
	private WeatherDAO(){
		list = new ArrayList<>();
	}
	
	public static WeatherDAO getInstance() {
		if(instance ==null) {
			instance = new WeatherDAO();
		}
		return instance;
	}
	public List<Weather> getWeatherList(String url){
		list.clear();
		connectXML(url);
		
		NodeList lists = doc.getElementsByTagName("data");
		
		for(int i=0; i< lists.getLength();i++) {
			Node data = lists.item(i); 
			NodeList datachild = data.getChildNodes(); //member�� ��� �ڽ� ��� �˾Ƴ�
			
			for(int j=0; j< datachild.getLength(); j++) {
				Node child = datachild.item(j); //����� �ڽ��� �ϳ��� �˾Ƴ�
				String name = child.getNodeName(); //��� �̸�(tag) �˾Ƴ���
				if(name.equals("hour")) { //����̸��� name�̸�
					hour = Integer.parseInt(child.getFirstChild().getNodeValue());
					continue;
				}
				if(name.equals("temp")) {
					temp = Double.parseDouble(child.getFirstChild().getNodeValue());
					continue;
				}
				if(name.equals("wfKor")) {
					wfKor = child.getFirstChild().getNodeValue(); 
					continue;
				}
				if(name.equals("reh")) {
					reh = Integer.parseInt(child.getFirstChild().getNodeValue()); 
					continue;
				}
			}
			Weather w = new Weather(hour,temp,wfKor,reh);
			list.add(w);
		}
		
		
		return list;
	}
	public void connectXML(String url) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder parser = factory.newDocumentBuilder(); 
			doc = parser.parse(url);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
