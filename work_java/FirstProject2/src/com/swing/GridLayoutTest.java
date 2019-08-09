package com.swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame { //LayoutTest�� JFrameâ�̴�.
	JButton a,b,c,d;
	
	public void gui() {
		a = new JButton("east");
		b = new JButton("west");
		c = new JButton("south");
		d = new JButton("north");
		setLayout(new GridLayout(3,2)); //3�� 2���� ȭ���� ����
		setDefaultCloseOperation(EXIT_ON_CLOSE); //JFrame.EXIT_ON_CLOSE
		
		Container cc = getContentPane(); //t.�ƴ�... Ŭ���� ������ JFrame�̱� ����!!
		cc.add(a);
		cc.add(b);
		cc.add(c);
		cc.add(d);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GridLayoutTest t = new GridLayoutTest(); //t�� â��
		t.gui(); //ȭ�� ����
		
	}

}
