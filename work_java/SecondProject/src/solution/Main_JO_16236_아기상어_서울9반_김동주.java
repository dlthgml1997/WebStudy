package solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_JO_16236_�Ʊ���_����9��_�赿�� {
	public static int N,Ans;
	public static int[][] space;
	public static void main(String[] args) throws Exception {
		System.setIn(new java.io.FileInputStream("res/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());//������ ũ��
		space = new int[N][N];
		for(int n=0; n<N; n++) {
			st = new StringTokenizer(br.readLine());
			for(int m=0; m<N; m++) {
				space[n][m] = Integer.parseInt(st.nextToken()); //������ ���´� 0, 1, 2, 3, 4, 5, 6, 9
				/* 0: �� ĭ
				1, 2, 3, 4, 5, 6: ĭ�� �ִ� ������� ũ��
				9: �Ʊ� ����� ��ġ  �Ѹ���*/
			}
		}
		
		
		System.out.println(Ans);//�Ʊ� �� ���� ���� ������ ��û���� �ʰ� ����⸦ ��Ƹ��� �� �ִ� �ð�
	}
}
