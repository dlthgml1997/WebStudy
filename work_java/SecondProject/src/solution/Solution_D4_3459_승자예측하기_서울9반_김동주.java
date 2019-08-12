package solution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_D4_3459_���ڿ����ϱ�_����9��_�赿�� { //���� �ȳѰ�, ���� 2x�ϸ� N�ʰ� �ǵ��� 2x +1
	static long N;
	static long x;
	static int n;
	static int curr;
	static boolean w; //false�̸� alice true�� bob
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_3459.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(br.readLine());
		//int T=sc.nextInt();

		for(int tc=1; tc<=T; tc++) {
			N = Long.parseLong(br.readLine());
			x = 1; curr=0;w = false;
			n = getpow(0);
			if (game(1,0,false)==false)System.out.println("#" + tc + " Alice");
			else System.out.println("#" + tc + " Bob");
		}
		br.close();
	}
	public static int getpow(int n) { //�־��� ���� ��������
		if(N < Math.pow(2, n)) return n;
		else return getpow(++n);
	}
		
	public static boolean game(long x, int curr, boolean w) { 
		if(N == Math.pow(2, n)-1) { //���� ����
			if((n-curr)%2 == 0) return w; //¦���� ���̳��� !w�� �̱�
			else return !w;
		}else if(N == Math.pow(2, n-1)+Math.pow(2, n-2)-1){ //�ݶ�
			if((n-curr)%2 == 0) return !w; //¦���� ���̳��� !w�� �̱�
			else return w;
		}else if(N > Math.pow(2, n-1)+Math.pow(2, n-2)-1){ //N�� ������
			if((n-curr)%2 == 0) return game(x*2+1, curr+1, !w); //¦���� ���̳��� !w�� �̱�
			else return game(x*2, curr+1, !w);
		}else {
			if((n-curr)%2 == 0) return game(x*2+1, curr+1, !w); //¦���� ���̳��� !w�� �̱�
			else return game(x*2, curr+1, !w);
		}
		
			
		
/*		if(2*x > N) return !w; //2x�� N�ʰ�. ���� ����� ����. 
		else if(2*x+1 > N) return w; //2x�� N�ʰ� ���ϴµ� 2x+1�� N�ʰ�. ��������� ����.
		else return game(2*x, !w);*/
	}
}