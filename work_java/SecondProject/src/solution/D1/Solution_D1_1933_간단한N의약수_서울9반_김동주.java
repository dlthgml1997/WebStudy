package solution.D1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution_D1_1933_������N�Ǿ��_����9��_�赿�� {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D1_1938.txt")); //�����Ҷ��� �Է� ����!!!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.print("1");
		//��� ���
		for(int n=2; n<=N; n++) {
			if(N%n==0) System.out.print(" " + n);
		}
	}
}
/*
public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    ArrayList<Integer> lst = new ArrayList<Integer>();
     
    for(int i=1; i<=N; i++) {
        if(N%i==0) lst.add(N/i);
    }
    Collections.sort(lst);
    for(int i=0; i<lst.size(); i++){
        sb.append(lst.get(i)+ " ");
    }
    System.out.print(sb);
}
*/