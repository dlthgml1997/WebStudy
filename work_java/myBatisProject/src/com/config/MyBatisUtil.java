package com.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	// mybatis.xml ��ġ  //myBatis �������� ���
    private final static String RESOURCE = "com/config/Configuration.xml";
    private static SqlSessionFactory factory = null;
    
    // MyBatis ������ ��� �޼ҵ�
    public static SqlSession getSqlSession() {
         if (factory == null) {
               Reader reader= null;
               
               try {
                     // mybatis.xml �ڿ��� ��´�.
                     reader = Resources.getResourceAsReader(RESOURCE);
                     factory = new SqlSessionFactoryBuilder().build(reader);
                     
               } catch (IOException e) {
                     e.printStackTrace();
                     
               }finally {
            	   if(reader!=null) {
            		   try{reader.close();}catch(Exception e) {}
            	   }
               }
         }
         return factory.openSession();
    }
}

