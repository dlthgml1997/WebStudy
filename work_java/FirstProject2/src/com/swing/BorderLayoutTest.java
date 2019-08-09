package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame { //LayoutTest�� JFrameâ�̴�.
	JButton a,b,c,d;
	
	public void gui() {
		a = new JButton("east");
		b = new JButton("west");
		c = new JButton("south");
		d = new JButton("north");
		//setLayout(new BorderLayout()); //���������߾� 5���� ȭ���� ���� //JFrame�� ����Ʈ
		setDefaultCloseOperation(EXIT_ON_CLOSE); //JFrame.EXIT_ON_CLOSE
		
		Container cc = getContentPane(); //t.�ƴ�... Ŭ���� ������ JFrame�̱� ����!!
		cc.add(a, "East");
		cc.add(b, "West");
		cc.add(c, "South");
		cc.add(d, "North");
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderLayoutTest t = new BorderLayoutTest(); //t�� â��
		t.gui(); //ȭ�� ����
		
	}

}
