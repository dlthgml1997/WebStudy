package com.basic;

public class LoopTest2_ {

	public static void main(String[] args) {
		// �������� for -- logic�� ������ �߾ȳ� �� 
here:	for(int i = 0; i < 5; ++i) { //0,1,2,3,4 //here��� label�� ����
			for(int j = 0; j < 3; j++) { //0,1,2
				for(int k = 0; k < 3; k++) { //0,1,2
					if(j == 2)
						//break here; //k�� 2���Ǹ� here���� ���������� ���� �ݺ����� Ż��
						continue here;
					System.out.println(i + "," + j + "," + k);
				}
			}
			
		}
		System.out.println("-----------------------------");
	}
	
}
