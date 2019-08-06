package com.exception;
//����� ���� ���� Ŭ����
class TransferException extends Exception {

	@Override
	public String toString() {
		return "���� �߻�";
	}

}
public class MoneyTransfer {

	public static void main(String[] args) {
		MoneyTransfer t = new MoneyTransfer();
		t.transfer();//��ü
	}
	
	private void transfer() { //���� ���⼭�� throws�ϸ� �ͼ����� �������� ���޵ȴ�
		withdraw();//���
		try {
			deposit();//�Ա�
		} catch (TransferException e) {
			System.out.println("�Աݿ��ܹ߻�");
			System.out.println("������");
		}
	}

	private void deposit() throws TransferException { //ȣ���ڷ� ������ �ͼ����� �����Ѵ�. ���� transfer()�޼��忡�� try~catch�� �޴´�.
		//���ܹ߻� -> �Աݽ���
		throw new TransferException();
	}

	private void withdraw() {
		//...
		System.out.println("��ݼ���");
	}

}
