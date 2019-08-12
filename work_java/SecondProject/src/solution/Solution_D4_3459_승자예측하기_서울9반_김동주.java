package solution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_D4_3459_���ڿ����ϱ�_����9��_�赿�� { 
	static long N;
	//static long x;
	static int n;
	//static int curr;
	static boolean w; //false�̸� alice true�� bob
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_3459.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int tc=1; tc<=T; tc++) {
			N = Long.parseLong(br.readLine());
			//n = getpow(0);
			n = (int) (Math.log10(N)/Math.log10(2)+1);
			//System.out.println(getpow(0));
			if (game(1,1,false)==false)System.out.println("#" + tc + " Alice");
			else System.out.println("#" + tc + " Bob");
		}
		br.close();
	}
/*	public static int getpow(int n) { //�־��� ���� ��������
		if(N < Math.pow(2, n)) return n;
		else return getpow(++n);
	}*/
		
	public static boolean game(long x, int curr, boolean w) { 
		if(N >= (long)((x+1)*Math.pow(2, (n-curr))-1)){ //���� ����
			if((n-curr)%2 == 0) return !w; //¦���� ���̳��� �� 
			else return w;
		}else if(N < (long)(x*Math.pow(2, (n-curr)))){
			if((n-curr)%2 == 0) return w; 
			else return !w;
		}else {
			if((n-curr)%2 == 0) return game(x*2+1, curr+1, !w); 
			else return game(x*2, curr+1, !w);
		}
	}
}