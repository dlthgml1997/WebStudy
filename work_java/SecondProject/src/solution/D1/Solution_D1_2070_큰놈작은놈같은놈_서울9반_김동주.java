package solution.D1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_D1_2070_ū������������_����9��_�赿�� {
	public static int a;
	public static int b;
	public static StringTokenizer st; //�� ���̶� ��ũ������ ����!!!
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D1_1936.txt")); //�����Ҷ��� �Է� ����!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(a>b) System.out.println("#"+tc+" >");
			else if(a<b) System.out.println("#"+tc+" <");
			else System.out.println("#"+tc+" =");
		}
	}
}

