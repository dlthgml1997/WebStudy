package solution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_D1_2043_�����Ǻ�й�ȣ_����9��_�赿�� {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D1_2043.txt")); //�����Ҷ��� �Է� ����!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] X = br.readLine().split(" ");
		int P = Integer.parseInt(X[0]);
		int K = Integer.parseInt(X[1]);
		if(P>K) System.out.println(P-K+1); //���̸�ŭ�� ���纸�� ��.
		else System.out.println(1000-K+P);
	}
}