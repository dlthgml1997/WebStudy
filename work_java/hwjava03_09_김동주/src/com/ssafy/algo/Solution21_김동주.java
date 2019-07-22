package com.ssafy.algo;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution21_�赿�� {
	public static final int[][] d2 = {{0,1,0}, 
									  {0,0,1}}; //0,��1,��2
	public static void main(String[] args) throws Exception 
	{
		System.setIn(new FileInputStream("res/Solution21.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc=1; tc<=T; tc++) {
			//int max = 0;
			int N = sc.nextInt();
			int[][] X = new int[N][N]; //����
			int Bugs = sc.nextInt();
			
			int TheBug = 0;
			int[] row = new int[Bugs];
			int[] col = new int[Bugs];
			int[] dir = new int[Bugs];
			
			for(int b=0;b<Bugs;b++) {
				row[b] = sc.nextInt();
				col[b] = sc.nextInt();
				dir[b] = sc.nextInt(); //�ұ�����b���� ��,��,������ �Է¹޾Ҵ�.
			}
			
			for(int b=0;b<Bugs;b++) {//b�� �ұ����� ����
				if(X[row[b]][col[b]] == 1) { //���۽ÿ� üũ, �̹�������(1) ������ ���
					TheBug = b+1;
					break;
				}//else {
				//	X[row][col] = 1;
				//}
				
				row[b] = row[b] + d2[0][dir[b]] * 3;
				col[b] = col[b] + d2[1][dir[b]] * 3;//3�ٱ�
				
				if((row[b]<0) || (row[b]>=N) || (col[b]<0) || (col[b]>=N)) { //������ �����ٸ� ����
					continue;
				}else if(X[row[b]][col[b]] == 1) { //üũ, �̹�������(1) ������ ���
					TheBug = b+1;
					break;
				}else {
					X[row[b]][col[b]] = 1;
				}
				
				row[b] = row[b] + d2[0][dir[b]] * 2;
				col[b] = col[b] + d2[1][dir[b]] * 2;//2�ٱ�
				
				if((row[b]<0) || (row[b]>=N) || (col[b]<0) || (col[b]>=N)) { //������ �����ٸ� ����
					continue;
				}else if(X[row[b]][col[b]] == 1) { //üũ, �̹�������(1) ������ ���
					TheBug = b+1;
					break;
				}else {
					X[row[b]][col[b]] = 1;
				}
				
				row[b] = row[b] + d2[0][dir[b]] * 1;
				col[b] = col[b] + d2[1][dir[b]] * 1;//1�ٱ�
				
				if((row[b]<0) || (row[b]>=N) || (col[b]<0) || (col[b]>=N)) { //������ �����ٸ� ����
					continue;
				}else if(X[row[b]][col[b]] == 1) { //üũ, �̹�������(1) ������ ���
					TheBug = b+1;
					break;
				}else {
					X[row[b]][col[b]] = 1;
				}
				
			}//b�� �ұ����� �Ϸ�
			System.out.println("#"+tc+" "+ TheBug);
		}
	}
}
