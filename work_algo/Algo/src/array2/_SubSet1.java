package array2;

public class _SubSet1 {
	public static int[] a = {1,2,3,4};
	public static int[] bit = new int[4];
	public static void main(String[] args) { //들어가는 경우 안들어가는 경우 2^n모두 만들기
		for(int i=0; i<2; i++) {
			bit[0] = (i%2==0)? 0:1;
			for(int j=0; j<2; j++) {
				bit[1] = (j%2==0)? 0:1;
				for(int k=0; k<2; k++) {
					bit[2] = (k%2==0)? 0:1;
					for(int l=0; l<2; l++) {
						bit[3] = (l%2==0)? 0:1;
						System.out.print("{");
						System.out.print((bit[0]==1)? a[0]+" ": "");
						System.out.print((bit[1]==1)? a[1]+" ": "");
						System.out.print((bit[2]==1)? a[2]+" ": "");
						System.out.print((bit[3]==1)? a[3]+" ": "");
						System.out.println("}");
					}
				}
			}
		}
		
	}
}
