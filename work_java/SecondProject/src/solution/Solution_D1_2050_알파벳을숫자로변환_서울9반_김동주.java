package solution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_2050_���ĺ������ڷκ�ȯ_����9��_�赿�� {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D1_2050.txt")); //�����Ҷ��� �Է� ����!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] T = br.readLine().toCharArray();
		for(int i=0; i<T.length-1; i++) {
			System.out.print((int)T[i]-64+ " ");
		}
		System.out.println((int)T[T.length-1]-64);
	}
}