package com.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingTest {

	public static void main(String[] args) {
		JFrame f = new JFrame(); //ȭ��
		//JFrame�� �⺻���� BorderLayout�� ��������
		f.setLayout(new FlowLayout()); //��ġ ������ ����. add��Ű�� ������� ȭ�鿡 ����
		Container c = f.getContentPane(); //ȭ�� ���� ��ҵ��� ���� ContentPane ������ �˾Ƴ�
		//â�ݱ� ��ư Ŭ��(CloseOperation)�� ���� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //����ƽ �ʵ�
		
		JButton ok = new JButton("ok");
		JButton cancel = new JButton("cancel");
		JRadioButton jb = new JRadioButton("one"); //���׶���
		JCheckBox jc = new JCheckBox("red");
		JTextArea ta = new JTextArea(5, 30); //������
		JTextField tf = new JTextField(50); //����
		JLabel la = new JLabel("hello, swing");
		
		c.add(la);
		c.add(ok);
		c.add(cancel);
		c.add(jb);
		c.add(jc);
		c.add(ta);
		c.add(tf);
		
		f.setSize(300, 500); //âũ�� ����
		f.setVisible(true); //����ÿ� ���� ���̵���(��Ÿ������) //�׳� â�� ���� ���α׷��� ����Ǵ°��� �ƴϰ� �� ���� false�� �Ǵ� ��(�Ⱥ��̰Ը� �ȴ�)
							//��Ʈ���� ���ϵ��� �ݰų� db�������� �ϰ� ����Ǿ�� �ϱ� ����
	}
}
