package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.CustomerController;

//annotation��� web.xml �ۼ�
//client�� ��� ��û�� ó���� ������ front controller
public class CustomerFilter implements Filter {	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			HttpServletRequest req = (HttpServletRequest)request;	
			HttpServletResponse res = (HttpServletResponse)response;
			
			req.setCharacterEncoding("euc-kr");
			
			//Ŭ���̾�Ʈ�κ��� ���� ��û�� �����ؼ� Controller���� �۾� ����
			// url ������ �ǵ޺κ��� ���� �˾Ƴ� getServletPath(): /list.cus, /read.cus ....

			//http://localhost:8080/customer/list.cus  : Ŭ���̾�Ʈ�� �� ��û
			//			����:port/Context_Root/Servlet_Path
			String reqString = req.getServletPath();
			//System.out.println(reqString);
			
			CustomerController cc = new CustomerController();
			
			if(reqString.equals("/list.cus")){				
				cc.list(req, res);
				
			}else if(reqString.equals("/read.cus")){
				cc.read(req, res);
				
			}else if(reqString.equals("/insert.cus") ){
				cc.insertForm(req, res);
				
			}else if(reqString.equals("/insertProcess.cus")){
				cc.insert(req,  res);
				
			}else if(reqString.equals("/delete.cus")){
				cc.delete(req,  res);
				
			}				
	}
	
	public void init(FilterConfig fConfig) throws ServletException {}
	public void destroy() {}

}





