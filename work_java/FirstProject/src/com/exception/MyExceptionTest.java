package com.exception;
//����� ���� Exception Ŭ���� : Exception Ŭ������ ��ӹ޾ƾ� ��!
class MyException extends Exception {
	@Override
	public String toString() { //(���۷����� ������� �ڵ�ȣ��Ǵ�) toString�� �������̵�
		return "MyException �߻� : 0�̳� ������� �־��ּ���";
	} //MyException��ü�� �����Ѵ� == ���ܰ� �߻��Ѵ�!!
	
}


public class MyExceptionTest {
	public void go() {
		System.out.println("gogo~~~~");
	}
	//throw new MyException : �ش� �޼ҵ� ���� ���߿� Ư���� ������ �Ǹ� ���ܰ� �߻��� �� ������ ǥ���ϴ� ����(�� �ͼ����� �߻���ų �� �ִ�.)
	//���ܰ� �߻��Ǿ ó���� ���� �ʰ� ȣ���ڷ� ���ܸ� �����ϴ� ���� ǥ�� - ���⼭�� main
		
	public void check2(int num) throws MyException { //throw's' �ͼ���
		if(num >= 0) {
			System.out.println(--num);
		}else {
			throw new MyException();
		}
	}
	
	public void check(int num) { 
		if(num >= 0 ) {
			System.out.println(++num);
		}else{//num�� ������ ��츦 ���� ��Ȳ���� ó�� -> ���ܸ� �߻���Ŵ
			
			try {
				throw new MyException(); // -> ���� �߻���ų�� ���(throw �ͼ��ǰ�ü )
			} catch (MyException e) {
				System.out.println(e);
			}
			
		}
	}

	public static void main(String[] args) { //���� main���� throws�� ������ �ƹ��� ����ó���� ���� �ʾ� VM���� ����. - �����۾� �߻�
		MyExceptionTest test = new MyExceptionTest();
		//test.check(-66);
		try {
			test.check2(-66);
		} catch (MyException e) {
			e.printStackTrace();
		}
		
	}

}
