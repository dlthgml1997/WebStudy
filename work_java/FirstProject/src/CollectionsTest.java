import java.util.ArrayList;
import java.util.Collections;
//String, Wrapper Ŭ����(�� �� Boolean ����~) ����
//�� Ŭ�������� �̹� implements Comparable<String>���� �ϰ� �ִ�!!
public class CollectionsTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(10));
		list.add(new Integer(30));
		list.add(new Integer(2));
		list.add(new Integer(6));
		list.add(new Integer(5));
		list.add(new Integer(22));
		
		Collections.sort(list); //ArrayList�� �����Ҷ��� CollectionsŬ������ ����Ʈ�ؼ� ����Ѵ�.
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("welcome");
		list2.add("apple");
		list2.add("banana");
		list2.add("xman");
		list2.add("fill");
		
		Collections.sort(list2);
		System.out.println(list2);
	}

}
