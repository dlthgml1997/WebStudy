import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//�ΰ� �������� ���� �� ���� ���� Ŭ������ ���� ����
class ActorComparator implements Comparator<Actor>{
	@Override
	public int compare(Actor o1, Actor o2) { //Comparator<Actor>�������̽��� �ϼ��ϴ� �޼���
		String o1name = o1.getName();
		String o2name = o2.getName();
		return o1name.compareTo(o2name); //String�� �̹� Comparable�� compareTo()�޼���-���ı����� ������ �ִ�.
	}
}

//vo
class Actor implements Comparable<Actor>{ //�ڱ�Ŭ������ <>�� �����ش�.
	private int num; //�⺻ ���� ����
	private String name;
	private int age;
	
	public Actor(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Actor [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

	@Override 
	public int compareTo(Actor other) { //Comparable<Actor>�������̽��� �ϼ��ϴ� �޼���
		//��������	
		if(this.getAge() < other.getAge())
			return -1; //����(this)��ü�� ���ڸ��� �״��
		else if(this.getAge() == other.getAge())
			return 0; //���ذ�ü�� ���ڸ��� �״��
		else
			return 1; //���ذ�ü�� �ڸ��� �ٲ�!
	}

}
public class ActorTest{
	public static void main(String[] args) {
		ArrayList<Actor> list = new ArrayList<>();
		list.add(new Actor(12, "Hellen", 36));
		list.add(new Actor(5, "Julie", 17));
		list.add(new Actor(7, "Anne", 46));
		list.add(new Actor(2, "William", 25));
		
		Collections.sort(list);
		
		for(Actor a : list) {
			System.out.println(a.getAge() + ":" + a.getName());
		}
		
		Collections.sort(list, new ActorComparator());
		
		for(Actor a : list) {
			System.out.println(a.getName());
		}
	}
	
}
