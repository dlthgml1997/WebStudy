package com.config;
//������ ��������
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
    // mybatis ȯ�� ���� ���� ��ġ(���)
    private final static String RESOURCE = "com/config/Configuration.xml"; 
    private static SqlSessionFactory factory = null;
    
    // MyBatis SqlSession�� ��� �޼ҵ� //�� ����ƽ �޼��带 ȣ���ؼ� ����.
    public static SqlSession getSqlSession() {
         if (factory == null) {
               Reader reader= null;
               
               try {
                     // mybatis.xml �ڿ��� ��´�.
                     reader = Resources.getResourceAsReader(RESOURCE); //�������Ͽ� �Է� ������ ����
                     factory = new SqlSessionFactoryBuilder().build(reader); //1. new�� ���� builder ����//2. .build()�� factory���� 
                     
               } catch (IOException e) {
                     e.printStackTrace();
                     
               }finally {
            	   if(reader!=null) {
            		   try{reader.close();}catch(Exception e) {}
            	   }
               }
         }
         return factory.openSession(); //3. .openSession���� session���� -> Connection(��Ʈ��ũ ����) 1��
    }
}

