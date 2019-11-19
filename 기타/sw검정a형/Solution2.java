
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2 {
	static int N, M, map[][] = new int[9][9], copy[][] = new int[9][9];
	static boolean[][] seed = new boolean[9][9];
	static int[][] visit = new int[9][9];
	static int max;
	static int[] next = new int[3];
	static final int INF = 987654321;
	static int[] dR = { 0, -1, 0, 1 }, dC = { 1, 0, -1, 0 }; // �������

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());

		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					copy[i][j] = map[i][j] = Integer.parseInt(st.nextToken()) > 0 ? INF : 0;
				}
			}
			// end of input
			max = 0;
			copy();
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 0) {
						for (int k = 0; k < 4; k++) { // ���� : �������
							int result = go(i, j, k);
//							System.out.printf("%d %d %d\n",i, j, result);
							max = Math.max(result, max);
							copy();
						}
					}
				}
			}
			System.out.printf("#%d %d\n", t, max);
		} // end of TC
	}

	private static void copy() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				map[i][j] = copy[i][j];
				visit[i][j] = 4;
				seed[i][j] = false;
			}
		}

	}

	private static int go(int R, int C, int K) { // ��� ��ġ, ����
		int sum = 0; // ��Ȯ��
		int r = R;
		int c = C;
		int k = K;

		for (int m = 1; m <= M; m++) { // M�� ��
			// �� ����
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (seed[i][j]) {
						map[i][j]++;
					}
				}
			}
			// �κ� ����
			boolean find = false;
			if (!seed[r][c]) { // �� ����
				if (find = find(r, c, k)) { //�̵������Ҷ�
					seed[r][c] = true; // �� �ɱ�
					map[r][c] = -1;
				}
				// �ƹ��͵� �� �ϱ�
			} else { // �ɾ��� �� = ���
				// ��Ȯ
				sum++;
				map[r][c] = 0;
				seed[r][c] = false;
				visit[r][c]++;
				find = find(r, c, k);
			}
			// �κ� ����
			if (find) { // �̵� ������ ���
				r = next[0];
				c = next[1];
				k = next[2];
			} // �ƹ��͵� �� �ϱ�
		}
		return sum;
	}

	private static boolean find(int R, int C, int K) {
		int newR, newC;
		int k = K - 1 >= 0 ? K - 1 : 3;
		for (int tmp = 0; tmp < 4; tmp++, k++) {
			k %= 4;
			newR = R + dR[k];
			newC = C + dC[k];
			if (newR < 0 || newR >= N || newC < 0 || newC >= N)
				continue;
			int curV = map[newR][newC]; // ��ġ�� ��
			int curG = visit[newR][newC];
			boolean curS = seed[newR][newC];// ��ġ ���� ����
			if ((curV == 0 && !curS) || (curS && curV >= curG)) {
				next[0] = newR;
				next[1] = newC;
				next[2] = k;
				return true;
			}
		}
		return false;
	}
}
