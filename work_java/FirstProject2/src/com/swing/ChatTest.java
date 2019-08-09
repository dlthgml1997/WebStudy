package com.swing;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//1. tf���� ����Ű ġ�� ActionEvent �߻� -> ActionListener�� ó�����־�� ��. (Ŭ���� ����ÿ� ������ ǥ��)
public class ChatTest extends JFrame implements ActionListener { 
	//JTextArea, JTable, JList -> ȭ�鿡 �ٷ� ���� ���̸� �ȵ�. (��ũ�ѹٰ� �ִ� Pane(��)���� �ø� ������ ȭ�鿡 �ٿ��� ��)
	JButton a,b,c,d;
	JLabel la;
	JTextArea ta;
	JTextField tf;
	
	public void gui() {
		a = new JButton("east");
		tf = new JTextField(20);
		la = new JLabel("�ȳ�, ����!", JLabel.CENTER); //����, ����
		ta = new JTextArea(5,20); //5��, 20�������� ���� ������ ����� ��
		JScrollPane pane = new JScrollPane(ta); //"scroll�ٰ� �پ� �ִ� ��"���� ta�� �÷ȴ�.
		
		Font font = new Font("�ü�ü", Font.BOLD, 30); 
		la.setFont(font); //�󺧿� ��Ʈ�� ����
		
		//2. ����� �߻��ϴ� ��󿡰� ������(������)���
		tf.addActionListener(this); //�ڱ��ڽŰ�ü�� �ǹ� //�����ʰ� this(=�����ʸ� ���ø�����)��ü�� actionPerformed()�޼ҵ带 ã�ư�!!
		//tf.addActionListener(this); //�����ڸ� 2�� ���̸� �۾��� 2�� ����
		
		//setLayout(new BorderLayout()); //���������߾� 5���� ȭ���� ���� //JFrame�� ����Ʈ
		//setDefaultCloseOperation(EXIT_ON_CLOSE); //JFrame.EXIT_ON_CLOSE
		
		///////////////
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("â�� �ݽ��ϴ�");
				//��Ʈ��, ���� close
				System.exit(0); //���μ��� ����!!
			}//()�ȿ� �����츮����(�Ǵ� ������ �����)�� "��ӹ޴� �ڽ� ��ü!!!"�� �־�� ��. -> �������� ����
		}); //this�� ������ ���̱� �տ� this.������ ���� �ʿ����! 
		////////////////
		
		Container cc = getContentPane(); //t.�ƴ�... Ŭ���� ������ JFrame�̱� ����!! //ū �����̳�
		
		cc.add(la, "North");
		cc.add(pane, "Center"); //�г��� ����
		//cc.add(panel, "South"); //�г��� ����
		cc.add(tf, "South"); 
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ChatTest t = new ChatTest(); //t�� â��
		t.gui(); //ȭ�� ����
		
	}
	
	//3. ActionListener�� ������ �ִ� �߻�޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		//1. tf�� �Է��� ���� �˾Ƴ���
		String msg = tf.getText();
		
		//2. msg�� ta�� ���̱� + �������׵� ��������!!(writeUTF��)
		ta.append( msg +"\n");
		
		//3. tf �����
		tf.setText(""); //���ڿ��� ����
	}

}
