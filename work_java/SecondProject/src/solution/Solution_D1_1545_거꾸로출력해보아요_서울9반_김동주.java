package solution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_D1_1545_�Ųٷ�����غ��ƿ�_����9��_�赿�� {
	public static int a;
	public static int b;
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D1_2019.txt")); //�����Ҷ��� �Է� ����!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int tc=T; tc>=0; tc--) {
			System.out.print(tc+" ");
			//sb.append(tc+" ");
		}
		//System.out.println(sb);
	}
}

