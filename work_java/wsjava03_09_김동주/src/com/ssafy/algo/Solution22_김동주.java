package com.ssafy.algo;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution22_�赿��_��_ {

	public static void main(String[] args) throws Exception 
	{
		System.setIn(new FileInputStream("res/Solution22.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] d4 = {{-1,1,0,0}, 
					  {0,0,-1,1}}; //dir 1,2,3,4,
//		int[][] d8 = {{-1,-1,0,1,1,1,0,-1},
//			      	  {0,1,1,1,0,-1,-1,-1}};
		for (int tc=1; tc<=T; tc++) {
			//int max = 0;
			int N = sc.nextInt();
			int[][] X = new int[N][N]; //����
			int FirstBugs = sc.nextInt();
			int FinalBugs = 0;
			int[] row = new int[FirstBugs];
			int[] col = new int[FirstBugs];
			int[] dir = new int[FirstBugs];
			
			for(int b=0;b<FirstBugs;b++) {//b�� �ұ����� ����
				row[b] = sc.nextInt();
				col[b] = sc.nextInt();
				dir[b] = sc.nextInt()-1; //�ұ�����b���� ��,��,������ �Է¹޾Ҵ�.
				
				
				if(X[row[b]][col[b]] == 1) { //���۽ÿ� üũ, �̹�������(1) �״´�
					//FinalBugs--; 
					continue;
				}
				
				row[b] = row[b] + d4[0][dir[b]] * 3;
				col[b] = col[b] + d4[1][dir[b]] * 3;//3�ٱ�
				
				if((row[b]<0) || (row[b]>=N) || (col[b]<0) || (col[b]>=N)) { //������ �����ٸ� �״´�.
					//FinalBugs--; 
					continue;
				}else if(X[row[b]][col[b]] == 1) { //üũ, �̹�������(1) �״´�
					//FinalBugs--; 
					continue;
				}
				
				row[b] = row[b] + d4[0][dir[b]] * 2;
				col[b] = col[b] + d4[1][dir[b]] * 2;//2�ٱ�
				
				if((row[b]<0) || (row[b]>=N) || (col[b]<0) || (col[b]>=N)) { //������ �����ٸ� �״´�.
					//FinalBugs--; 
					continue;
				}else if(X[row[b]][col[b]] == 1) { //üũ, �̹�������(1) �״´�
					//FinalBugs--; 
					continue;
				}
				
				row[b] = row[b] + d4[0][dir[b]] * 1;
				col[b] = col[b] + d4[1][dir[b]] * 1;//1�ٱ�
				
				if((row[b]<0) || (row[b]>=N) || (col[b]<0) || (col[b]>=N)) { //������ �����ٸ� �״´�.
					//FinalBugs--; 
					continue;
				}else if(X[row[b]][col[b]] == 1) { //üũ, �̹�������(1) �״´�
					//FinalBugs--; 
					continue;
				}
				
				X[row[b]][col[b]] = 1; //���׾��� ��� �����ϰ� �ӹ���(1)
				FinalBugs++;
				
			}//b�� �ұ����� �Ϸ�
			System.out.println("#"+tc+" "+ FinalBugs);
		}
	}
}
