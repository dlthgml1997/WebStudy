package array2;

import java.util.Arrays;
import java.util.Scanner;

//중복순열 nPIr =n^r,  5PI3
public class Product {
	public static int n, r, cnt, a[];
	
	public static void product(int count) {
		if(count == r){
			cnt++;
			System.out.println(Arrays.toString(a));
			return;
		}
		for(int i=1; i<=n; i++) {
			a[count]=i;
			product(count+1);
		}
		
	} //count 0,1,2자리에 DFS?로 입력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 5; //sc.nextInt();
		r = 3; //sc.nextInt();
		a = new int[r];
		product(0);
		System.out.println(cnt);
		sc.close();
	}

}
