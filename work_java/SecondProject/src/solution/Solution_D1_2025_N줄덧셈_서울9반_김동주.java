package solution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_D1_2025_N�ٵ���_����9��_�赿�� {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D1_2025.txt")); //�����Ҷ��� �Է� ����!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] X = br.readLine().split(" ");
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		if(A==1) System.out.println((B==3)?"A":"B");
		if(A==2) System.out.println((B==1)?"A":"B");
		if(A==3) System.out.println((B==2)?"A":"B");
	}
}