/*package array1;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Algo^^");
		String h = "Hello";
		System.out.println(h.charAt(4));
		System.out.println("박찬호".length());
	}

}
*/
package array1;

import java.io.FileInputStream;
import java.util.Scanner;

public class Hello {
	
	public static final int i1= 11;
	public        final int i2= 12;
	public static       int i3= 13;
	public              int i4= 14;
	
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("res/input_D3_1208.txt")); 
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 0; tc < 10; tc++)
		{
			int[] X = new int [100]; // 상자 높이
			int T = sc.nextInt();// 덤프횟수
			for(int i=0; i<100; i++) {
				X[i] = sc.nextInt();
			}
			System.out.println("#"+(tc+1)+" ");
		}
		int n=123;
		System.out.println(Integer.toBinaryString(n)); //2진수표현
		String s ="10";
		System.out.println(Integer.parseInt(s,10)); 
		System.out.println("---------------");
		System.out.println(1<<0);
		System.out.println(1<<1);
		System.out.println(1<<2);
		System.out.println(1<<3);
		System.out.println(1<<4);
		System.out.println(1<<5);
		System.out.println(1<<6);
		System.out.println(1<<7);
		System.out.println(1<<8);
		System.out.println(1<<9);
		System.out.println(1<<10);
		System.out.println(1<<11);
		System.out.println(1<<12);
		System.out.println(1<<13);
		System.out.println(1<<14);
		System.out.println(1<<15);
		System.out.println(1<<16);
		System.out.println(1<<17);
		System.out.println(1<<18);
		System.out.println(1<<19);
		System.out.println(1<<20);
		System.out.println(1<<21);
		System.out.println(1<<22);
		System.out.println(1<<23);
		System.out.println(1<<24);
		System.out.println(1<<25);
		System.out.println(1<<26);
		System.out.println(1<<27);
		System.out.println(1<<28);
		System.out.println(1<<29);
		System.out.println("---------------");
		System.out.println(128>>1);
		System.out.println(128>>2);
		System.out.println(128>>3);
		System.out.println(128>>4);
		System.out.println(128>>5);
		System.out.println(128>>6);
		System.out.println(128>>7);
		System.out.println(128>>8);
		System.out.println("---------------");
		System.out.println(-128>>1);
		System.out.println(-128>>2);
		System.out.println(-128>>3);
		System.out.println(-128>>4);
		System.out.println(-128>>5);
		System.out.println(-128>>6);
		System.out.println(-128>>7);
		System.out.println(-128>>8); //>>는 부호 유지, >>>는 부호를 없앤다 ...

		
	}
}