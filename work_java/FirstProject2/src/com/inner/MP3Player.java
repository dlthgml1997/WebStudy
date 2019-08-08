package com.inner;
//Anonymous class
//�� �߻�޼��尡 �ƴϴ��� �������̵��ؼ� 1ȸ�� ��ü�� ���鶧 ����� �� �ִ�.
abstract class Song{ //�߻�Ŭ����(�����Ұ�) - �����Ϸ��� (�޼��带 ��� �ϼ��ϴ�)�ڽ����� �����ؾ���
	public abstract void sing();
	
	
}
interface Video{
	//int num = 99;
	void play();
}


public class MP3Player {
	
	public void play(Song s) { //Song�� �ڽ� ��ü�� ������
		s.sing();
	}
	public void play(Video v) { //play()�޼ҵ� �����ε�
		v.play();
	}

	public static void main(String[] args) {
		MP3Player player = new MP3Player();
		player.play(new Song() { //SongŬ������ ����°��� �ƴϰ�! Song�� ��ӹ޴�(extends�ϴ�), ������ �ڽ� Ŭ���� ���� �� new
			public void sing() { //Song�� ������ �ִ� �߻� �޼ҵ� �ϼ�
				System.out.println("happy happy song!!!");
			}
		}); //������� player.play(����ü);
		
		player.play(new Song() {
			public void sing() { //Song�� ������ �ִ� �߻� �޼ҵ� �ϼ�
				System.out.println(this.getClass().getName()); //com.inner.MP3Player$2 : �ι�° ����Ŭ������ �̸� 2.
			}
		});
		
		player.play(new Video() { //Video�������̽��� �����ϴ� ������ Ŭ������ ���� �� ����
			@Override 
			public void play() {
				System.out.println(this.getClass().getName()); //com.inner.MP3Player$3
			} 
		});
		
	}

}
