package solution.D1;

public class Solution_D1_2027_�밢������ϱ�_����9��_�赿�� {
	public static char[][] X = new char[5][5];
	public static void main(String args[]) throws Exception {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==j) X[i][j]='#';
				else X[i][j]='+';
				System.out.print(X[i][j]);
			}
			System.out.println();
		}
	}
}