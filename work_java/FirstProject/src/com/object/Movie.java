package com.object;

/**
 * <pre>
 * ȸ������(Data)�� 
 * @author ȫ�浿
 * @version 1.0
 * @see String
 */


public class Movie {
		/** ���� �����͸� �����ϴ� ����*/
		String title;
		String director;
		int grade;
		String genre;
		String summary;
		
		/** ��ü�� ������ �ִ� ������ ����ϴ� �޼���*/
		public void movieInfo() {
			System.out.println("* ����:"+title+"\t����:"+director
					+"\t���:" + grade + "\t�帣:" + genre
					+ "\n�ٰŸ�:" + summary);
		}

}
