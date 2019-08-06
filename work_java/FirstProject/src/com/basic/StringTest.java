package com.basic;

public class StringTest {

	public static void main(String[] args) {
		String a = new String("mylimeorange"); //new�� �����߱� ������ Heap�� ����
		String b = "mylimeorange"; // C.A���� Constant Pool�� ����!!
		String c = "mylimeorange"; //��Ʈ���� ��üŸ���� �����ϰ� �⺻��ó�� ������ �ٷ� �������� ����
		
		if(a==b) //�� ������ �ּҰ� ��, Heap�� C.A�� �����Ƿ� �ٸ�
			System.out.println("a==b"); //X 
		if(a.equals(b)) //���� ��
			System.out.println("a.equals(b)"); //O
		if(b==c) //Constant pool���� ���� �����͸� ����Ű�� ����. ���� �ϳ��ε� ����Ű�� ������ 2���̹Ƿ� ������ �ٲٸ� �ٸ��ʵ� �ٲ�(->�׷��� ��Ʈ��Ŭ������ "������ �׻� ������ �ȵ�")
			System.out.println("b==c"); //O
		
		String aa = b.toUpperCase(); //������ �״�� �ΰ� �빮�ڷε� ���ڿ��� ���� ���� �������
		System.out.println(aa);
		System.out.println(b); //b�� �״��
		
		a.concat("gogo"); //������ �״�� �ΰ�
		System.out.println(a); //c�� �״�� 
		
		b=b+"hello"; //������ ������ b�� �־����Ƿ� b�� ���ο� ���� ����Ŵ
		System.out.println(b);
		System.out.println(b.substring(0,5));//0~4�ε���
		System.out.println(b.substring(5)); //���꽺Ʈ���� �����ε��Ǿ�����. 5~���ε��� 
		System.out.println(b.charAt(2));
		System.out.println(b.replace('m','x'));
		
		//SB�� ���� �����Ϳ� �ٷ� ������  -> ��Ʈ������ �޸� ����
		StringBuffer buffer = new StringBuffer("mylimeorange");
		buffer.append("hello"); //String���� .concat()�� SB������ .append()
		System.out.println(buffer); 
	}

}
