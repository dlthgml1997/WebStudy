package com.ssafy.algo;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution13_�赿��_��_ {

public static final int[][]	d8 = {{-1,-1,0,1,1,1,0,-1},
    	  						{0,1,1,1,0,-1,-1,-1}};
	
	public static void main(String[] args) throws Exception 
	{
		System.setIn(new FileInputStream("res/Solution13.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
//		int[][] d4 = {{-1,0,1,0}, 
//					{0,1,0,-1}};
//		int[][] d8 = {{-1,-1,0,1,1,1,0,-1},
//			      	  {0,1,1,1,0,-1,-1,-1}}; //���������� �ظ��ϸ� �����ڹ�����
		for (int tc=1; tc<=T; tc++) {
			int max = 0;
			int N = sc.nextInt();
			int[][] X = new int[N][N]; //����
			
			for(int i=0 ; i<N ; i++) {
				for(int j=0; j<N; j++) {
					String get=sc.next();
					char get_c = get.charAt(0);////�ϸ� ù��° ��¥�� char������ �ٲ��ش�~
					if (get_c == 'G') { //G������ -1�� ����!
						X[i][j] = -1;
					}
					else if(get_c == 'B'){
						X[i][j] = 1; //B�� �켱 1��
					}
					//System.out.println(X[i][j]);
				}
				//System.out.println();
			}//�����ϼ�(��Ʈ��)
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(X[i][j]!= -1) { //���������̸�
						for(int d=0; d < 8; d++) { //8��üũ
							int ni = i + d8[0][d];
							int nj = j + d8[1][d];
							if(ni>=0 && nj>=0 && ni<N && nj<N) { //�������ʸ� ����ϵ��� ��
								if(X[ni][nj] == -1) {
									X[i][j]=2; 
									break;
								}
									
							}
						}
					} //���������� ���������̸� 1->2�� ����!
					if(X[i][j]==1) { //�������� �ƴ� ���������̸� �������̼����
						for(int d=0; d < 8; d++) {
							if(d%2==0) { //4���⸸
								for(int n=1; n<N; n++) {
									int ni = i + d8[0][d]* n;
									int nj = j + d8[1][d]* n;
									if(ni>=0 && nj>=0 && ni<N && nj<N) {
										if(X[ni][nj] !=-1) { //4���⿡ ������ �ִٸ�
											X[i][j]++; //�� ������ŭ�ױ�(������ �̹� 1�� �Ǿ������Ƿ� ����)
										}
									}
								}
							}
						}// �̷��� ���ϰ� �׳� ��/���� 1�� �����ϰ� N���� ������ �ȴ�.
					}
					if (max < X[i][j]) max = X[i][j];
				}
			} 
			System.out.println("#"+tc+" "+ max);
		}		
	}	
}
