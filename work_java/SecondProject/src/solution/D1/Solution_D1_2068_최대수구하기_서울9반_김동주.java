package solution.D1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//�Ʒ� ��Ʈ�� ���� ���¹�
public class Solution_D1_2068_�ִ�����ϱ�_����9��_�赿�� {
	public static int x;
	public static int max;
	public static StringTokenizer st; //�� ���̶� ��ũ������ ����!!!
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D1_1936.txt")); //�����Ҷ��� �Է� ����!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			max = 0 ; // �� tc���� �ʱ�ȭ�� �ʼ�!!!!
			for(int i=0; i<10; i++) { //while(st.hasMoreTokens())
				x = Integer.parseInt(st.nextToken());
				if (max<x) max=x;
			}
			System.out.println("#"+tc+" "+max);
		}
	}/*
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int testNum=Integer.parseInt(br.readLine());
        for(int i=1;i<=testNum;i++) {
            String str=br.readLine();
            StringTokenizer st=new StringTokenizer(str);
            int result=0;
            while(st.hasMoreTokens()) {
                int n1=Integer.parseInt(st.nextToken());
                if(result<n1)
                    result=n1;
            }
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.println(sb);
    }*/
}

