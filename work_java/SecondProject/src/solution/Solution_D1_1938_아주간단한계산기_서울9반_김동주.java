package solution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_D1_1938_���ְ����Ѱ���_����9��_�赿�� {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D1_1938.txt")); //�����Ҷ��� �Է� ����!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] X = br.readLine().split(" ");
		byte a = Byte.parseByte(X[0]);
		byte b = Byte.parseByte(X[1]);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
}