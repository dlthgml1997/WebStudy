package com.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParsingTest {
	
	public static void main(String[] args) throws Exception {
		
		SAXParserFactory factory = SAXParserFactory.newInstance(); //sax parser������ִ� factory�� ���� ����
		SAXParser parser = factory.newSAXParser();
		parser.parse("xml/book.xml", new MySaxParser()); //����, ��� �Ľ�����
	}
}
