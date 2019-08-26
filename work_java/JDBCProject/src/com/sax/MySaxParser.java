package com.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//Sax�Ľ� : �̺�Ʈ(�����±� ���� �� , �ؽ�Ʈ ���� �� , �ݴ��±� ���� ��) �߻��ø��� ó���ϴ� ���
//�̺�Ʈ �߻��ø��� �۾��ϴ� �ڵ鷯 Ŭ���� 
public class MySaxParser extends DefaultHandler{
	
	@Override
	public void startDocument() throws SAXException { //������ ���۵� ��
		System.out.println("��������");
	}

	@Override
	public void endDocument() throws SAXException { //������ ������
		System.out.println("������");
	}

	//������Ʈ ����
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException { //qname, attributes ���
		if(qName.equals("booklist")) {
			System.out.println("<booklist>");
			
		}else if(qName.equals("book")) {
			System.out.println("<book kind="+attributes.getValue("kind")+">");
			
		}else if(qName.equals("isbn")) {
			System.out.print("<isbn>");
			
		}else if(qName.equals("title")) {
			System.out.print("<title>");
			
		}else if(qName.equals("author")) {
			System.out.print("<author>");
			
		}else if(qName.equals("publisher")) {
			System.out.print("<publisher>");
			
		}else if(qName.equals("price")) {
			System.out.print("<price>");
		}
	}
	//������Ʈ ��
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("booklist")) {
			System.out.println("</booklist>");
			
		}else if(qName.equals("book")) {
			System.out.println("</book>");
			
		}else if(qName.equals("isbn")) {
			System.out.println("</isbn>");
			
		}else if(qName.equals("title")) {
			System.out.println("</title>");
			
		}else if(qName.equals("author")) {
			System.out.println("</author>");
			
		}else if(qName.equals("publisher")) {
			System.out.println("</publisher>");
			
		}else if(qName.equals("price")) {
			System.out.println("</price>");
		}
	}
	//�ؽ�Ʈ������
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch,start,length).trim();
		System.out.print(str);
	}
}
