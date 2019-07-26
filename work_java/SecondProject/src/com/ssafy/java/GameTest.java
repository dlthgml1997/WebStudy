package com.ssafy.java;

import java.util.Scanner; //Scanner메서드를 사용하기 위해 import

public class GameTest {

	public static void main(String[] args) {
		//int computer = (int)(Math.random() * 3) + 1; //1,2,3중 랜덤으로 1개 선택. int로 소수점 아래를 날렸다.
		Scanner s = new Scanner(System.in);
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.println("번호를 입력하세요. ");
		int num = s.nextInt(); //
		int pan = 7 - 2*num;
		int u_win = 0;
		//System.out.println("가위바위보 중 하나 입력: ");
		for(int i=1; i<pan+1; ) {
			int computer = (int)(Math.random() * 3) + 1;
			//System.out.println("가위바위보 중 하나 입력: ");
			String user = s.nextLine();
			//여기에 딜레이가 필요한것 같다;;;;;;;;;;;;;;;;;;;;;;;
			switch (user) {
				case "가위":
					if (computer==3){
						u_win++;
						System.out.println("이겼습니다!!!");
						i++;
					}else if (computer==2) {
						u_win--;
						System.out.println("졌습니다!!!");
						i++;
					}else { 
						System.out.println("비겼습니다!!!");
					}
					break;
					
				case "바위":
					if (computer==1) {
						u_win++;
						System.out.println("이겼습니다!!!");
						i++;
					}else if (computer==3) {
						u_win--;
						System.out.println("졌습니다!!!");
						i++;
					}else { 
						System.out.println("비겼습니다!!!");
					}
					break;

				case "보":
					if (computer==2) {
						u_win++;
						System.out.println("이겼습니다!!!");
						i++;
					}else if (computer==1) {
						u_win--;
						System.out.println("졌습니다!!!");
						i++;
					}else { 
						System.out.println("비겼습니다!!!");
					}
					break;
				default:
					//System.out.println("가위1, 바위2, 보3 중에서 입력해주세요!!");
					break;
			}
			System.out.println("가위바위보 중 하나 입력: ");
			
			if(Math.abs(u_win) > (pan-i) ) {
				if (u_win>0) {
					System.out.println("###사용자 승!!!");
				}else {
					System.out.println("###컴퓨터 승!!!");
					break;
				}
			}
		}
		
	}


}
