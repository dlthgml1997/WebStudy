import java.util.Arrays;
//Arrays : �⺻�� �迭
public class ArraysTest {
	public static void main(String[] args) {
		int[][] q = {{1,2},{3,4},{5,6,7}};
		System.out.println(Arrays.deepToString(q)); //2�����迭�� �����ش�.
		
		int[] a = {12, 4, 67, 1, 8, 11};
		Arrays.sort(a); //.sort()�� �迭�� ������������ �������ش�.
		System.out.println(Arrays.toString(a));
		
		int[] b = new int[1000];
		Arrays.fill(b, -1);
		System.out.println(Arrays.toString(b));
		
		int[] a2 = Arrays.copyOf(a, 3);
		int[] a3 = Arrays.copyOf(a, 10);
		
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
	}
}
