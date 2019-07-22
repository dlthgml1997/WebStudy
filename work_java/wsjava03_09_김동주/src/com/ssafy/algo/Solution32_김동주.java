package com.ssafy.algo;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution32_�赿��_��_ {
public static final int[][] d4 = {{0,1,0,-1}, 
								  {1,0,-1,0}}; //��������0123
	public static void main(String[] args) throws Exception 
	{
		System.setIn(new FileInputStream("res/Solution32.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc=1; tc<=T; tc++) {
			//int max = 0;
			int Y = sc.nextInt();
			int X = sc.nextInt();
			int N = sc.nextInt();
			
//			int A=0;
			int dir=0, jump=0, r =0, c =0 , total = (-1000)*N;
			int[][] A = new int[Y][X]; //������ �����
			
			for(int i=0; i<Y; i++) {
				for(int j=0; j<X; j++) {
					A[i][j]= sc.nextInt();	
				}
			}//������ ���� + ����, ����ĭ���� ����
			
			int[] row = new int[N];
			int[] col = new int[N];
			int[] num = new int[N]; //N���� ������ �����
			
			for(int n=0; n<N; n++) {
				row[n] = sc.nextInt()-1; 
				col[n] = sc.nextInt()-1;
				num[n] = sc.nextInt(); //����Ƚ��
			} //������ ����(������ǥ, ����Ƚ��)
			
			int TR = sc.nextInt(); //������

			int[] trow = new int[TR];
			int[] tcol = new int[TR]; //X���� ���� �����
			
			for(int x=0; x<TR; x++) {
				trow[x] = sc.nextInt()-1;
				tcol[x] = sc.nextInt()-1;
				A[trow[x]][tcol[x]] = 0; 
			}//���� ����, 0���� ���� ǥ��
			//�Է����ι���
			
			for(int n=0; n<N; n++) { //������n��
				for(int i=0; i<num[n]; i++) { //����Ƚ����ŭ
					dir= A[row[n]][col[n]]/10 -1; ////���⼭, �Ź� 1�� ���� �� ���� �ε���0��°�� ������ ���� �־��ִ°��� ����.
					jump= A[row[n]][col[n]]%10; //��ǥ�м�
					row[n] = row[n] + d4[0][dir] * jump;
					col[n] = col[n] + d4[1][dir] * jump;//����(��ǥ�̵�)
					if((row[n]<0) || (row[n]>=Y) || (col[n]<0) || (col[n]>=X) || (A[row[n]][col[n]]==0))  //���� ���̸� ����
						break;
				}
				//n�� ������γ�
				if((row[n]>=0) && (row[n]<Y) && (col[n]>=0) && (col[n]<X))
					total += (A[row[n]][col[n]]*100);
			}
			System.out.println("#"+tc+" "+ total);
		}
	}
}
