package com.object;

import java.awt.Button; //java.awt��Ű���� ButtonŬ������ ������ ���ٰ� ���Ѱ�.
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ObjectTest {

	public static void main(String[] args) {
		Checkbox c = new Checkbox("one");
		Checkbox c2 = new Checkbox("two", true);
		Checkbox c3 = new Checkbox();
		
		Button b = new Button("ok"); //��ư�� â �ȿ� �־����
		Button b2 = new Button();
		Frame f = new Frame(); //â
		f.setLayout(new FlowLayout());
		f.add(b); //â�� b�� ���δ�
		f.add(b2);
		f.add(c);
		f.add(c2);
		f.add(c3);
		
		f.setSize(300,300);
		f.setVisible(true);
	}

}
