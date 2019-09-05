package solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D4_3459_���ڿ����ϱ�_����9��_�赿�� { //���� �ȳѰ�, ���� 2x�ϸ� N�ʰ� �ǵ��� 2x +1
    static long N;
    static int T,n,diff,d2;
    static boolean w; //false�̸� alice true�� bob
    public static void main(String[] args) throws Exception {
    	//System.setIn(new FileInputStream("res/input_D4_3459.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
        
        T = Integer.parseInt(br.readLine());
    	//T = sc.nextInt();
    	
        for(int tc=1; tc<=T; tc++) {
            N = Long.parseLong(br.readLine());
            //N = sc.nextLong();
            n = (int) (Math.log10(N)/Math.log10(2)); //L�� ����
            if (!game(1,0,false)) sb.append("#" + tc + " Alice\n");
            else sb.append("#" + tc + " Bob\n");
        }
        System.out.println(sb);
    }
         
    public static boolean game(long x, int curr, boolean w) {
    	diff = n-curr; //������
    	d2 = diff%2;
    	
        if(N >= (long)((x+1)*Math.pow(2, diff)-1)){ //�ٴ��� ������ ��
            if(d2 == 0) return !w; //¦���� ���̳��� !w�� �̱�(���� �� �ƴѾ�)
            else return w;
        }else if(N < (long)(x*Math.pow(2, diff))){ //�ٴ��� ������ ��
            if(d2 == 0) return w; //Ȧ���� ���̳��� w�� �̱�(���� ���� ��)
            else return !w;
        }else {
            if(d2 == 0) return game(x*2+1, curr+1, !w); //¦���� ���̳� ���� ����������(�����̶� Ȧ����Ȯ���� �ְ�!!)
            else return game(x*2, curr+1, !w); //Ȧ���� ���̳� ���� ��������
        }
    }
}