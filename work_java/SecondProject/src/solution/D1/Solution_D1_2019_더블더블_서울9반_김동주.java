package solution.D1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_D1_2019_�������_����9��_�赿�� {
	public static int a;
	public static int b;
	public static StringTokenizer st; //�� ���̶� ��ũ������ ����!!!
	public static StringBuilder sb;
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D1_2019.txt")); //�����Ҷ��� �Է� ����!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int tc=0; tc<=T; tc++) {
			sb.append((int)Math.pow(2, tc)+" ");
		}
		System.out.println(sb);
	}
}

