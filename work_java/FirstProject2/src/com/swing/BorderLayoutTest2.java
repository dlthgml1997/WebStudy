package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BorderLayoutTest2 extends JFrame { 
	//JTextArea, JTable, JList -> ȭ�鿡 �ٷ� ���� ���̸� �ȵ�. (��ũ�ѹٰ� �ִ� Pane(��)���� �ø� ������ ȭ�鿡 �ٿ��� ��)
	JButton a,b,c,d;
	JLabel la;
	JTextArea ta;
	JList list;
	String[] color = {"red", "green", "blue", "white", "black", "magenta", "cyan", "yellow","red", "green", "blue", "white", "black", "magenta", "cyan", "yellow"};
	
	public void gui() {
		a = new JButton("east");
		b = new JButton("west");
		c = new JButton("south");
		d = new JButton("north");
		la = new JLabel("�ȳ�, ����!", JLabel.CENTER); //����, ����
		
		ta = new JTextArea(5,20); //5��, 20�������� ���� ������ ����� ��
		JScrollPane pane = new JScrollPane(ta); //"scroll�ٰ� �پ� �ִ� ��"���� ta�� �÷ȴ�.
		
		list = new JList<>(color); //()�� �迭�� �� ������ //���ٿ� �ϳ��� �Ѹ�
		JScrollPane pane2 = new JScrollPane(list);
		
		Font font = new Font("�ü�ü", Font.BOLD, 30); 
		la.setFont(font); //�󺧿� ��Ʈ�� ����
		JPanel panel = new JPanel(new BorderLayout()); //JFrame���� ���� container //����Ʈ�� Flow
		panel.add(a, "North");
		panel.add(b, "South");
		
		//setLayout(new BorderLayout()); //���������߾� 5���� ȭ���� ���� //JFrame�� ����Ʈ
		setDefaultCloseOperation(EXIT_ON_CLOSE); //JFrame.EXIT_ON_CLOSE
		
		Container cc = getContentPane(); //t.�ƴ�... Ŭ���� ������ JFrame�̱� ����!! //ū �����̳�
		//cc.add(a, "East");
		//cc.add(b, "West");
		cc.add(panel, "South"); //�г��� ����
		cc.add(la, "North");
		//cc.add(pane, "Center"); 
		cc.add(pane2, "Center"); 
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderLayoutTest2 t = new BorderLayoutTest2(); //t�� â��
		t.gui(); //ȭ�� ����
		
	}

}
