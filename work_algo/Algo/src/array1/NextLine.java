package array1;

import java.util.Arrays;
import java.util.Scanner;

public class NextLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		String[] sa = line.split(" "); //공백을 구분자로 스트링을 스트링 배열로 바꿈
		System.out.println(Arrays.toString(sa));
		
		String s = sc.next(); //기본형타입과 혼용 가능(Line은 불가능)
		char[] chs = s.toCharArray(); //스트링s를 한 글자씩 짤라서 캐릭터의 배열로 바꿈!
		System.out.println(Arrays.toString(chs)); //캐릭터의 배열을 다시 스트링으로 출력!
		//for(char ch : chs){}로 하나씩 캐릭터 배열에서 꺼낼 수도 있다.
		
		// "nextLine"은 "엔터"만을 구분자로 받아들임 -> 다른 함수(next, nextInt등)를 앞에 겹쳐 사용할 경우 
		//방법1. sc.nextLine();을 하나 사이에 껴준다. 
		int t= sc.nextInt();
		sc.nextLine();
		String st = sc.nextLine();
		System.out.println(st);
		//방법2. t=Integer.parseInt(sc.nextLine());으로 형변환된 nextline만을 사용해 다른것과 겹치지 않게 한다.
	}

}
