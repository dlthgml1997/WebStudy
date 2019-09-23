package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Customer;
import com.dao.CustomerDAO;
import com.dao.ICustomerDAO;

//Front Controller���� �Ѿ�� ��û�� Model���� �Ѱܼ� �۾� ����
//Model�� �۾� �� ����� �޾Ƽ� ������ �Ŀ� jsp�� �Ѿ� ��(forward).pojo
public class CustomerController {
	ICustomerDAO bean;
	
	public CustomerController(){ //�����ڿ��� DAO����
		bean = new CustomerDAO();
	}
	
	public void list(HttpServletRequest req, HttpServletResponse res) {
		//���ǿ� ���� ��ġ ������ѳ��� �α������� ��� ���ƿ���
		HttpSession session = req.getSession(); //session�� ������
		session.setAttribute("cpage", req.getRequestURI());
		System.out.println(req.getRequestURI()); // /customer/list.cus
		
		ArrayList<Customer> list = bean.selectAll();
		req.setAttribute("list", list);//jsp���� �����ؼ� ����ϵ��� ����
		
		//forward ������� jsp�� ��ȯ
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/customer/list.jsp"); //jsp�� ��ġ���
		try {
			dispatcher.forward(req, res);//jsp�� forward ��Ŵ
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//�� ���� �Ѱ� ó��
	public void read(HttpServletRequest req, HttpServletResponse res) {
		String num = req.getParameter("num");
		Customer c = bean.selectOne(num);
		req.setAttribute("c", c); //req�� �־� ����
		
		//forward ������� jsp�� ��ȯ
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/customer/read.jsp"); //jsp�� ��ġ���
		try {
			dispatcher.forward(req, res);//jsp�� forward ��Ŵ
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertForm(HttpServletRequest req, HttpServletResponse res) {
		//session�� üũ�ؼ� �α��� ������ �ֳ� Ȯ���ϰ� ��Ȳ�� �´� ȭ������ forward
		HttpSession session = req.getSession(); //session�� ������(Jsp�� �ٸ��� �� ������ �ʿ�) 
												//������ ������ ������ ������ return���ְ� ������ ���� �ϳ� ���� return����
		String id = (String)session.getAttribute("id");
		session.setAttribute("cpage", req.getRequestURI());//���ǿ� ���� ��ġ ������ѳ��� �α������� ��� ���ƿ���
		
		String url ="";
		
		if(id != null) { //�α��� �� ���
			//�Է��ϴ� ȭ���� �߰� �Ѵ�(db�� �ִ� �۾� ����)
			url = "/customer/insertForm.jsp";
		}else { //�α��� ���� ���
			url = "/customer/login.jsp";
		}
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher(url);
		try {
			//res.sendRedirect("/customer/insertForm.jsp");
			dispatcher.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(HttpServletRequest req, HttpServletResponse res) {
		//num, name, address�ޱ�
		//db�� insert
		String num = req.getParameter("num"); //�̸��� num���� �����Ͽ���
		String name = req.getParameter("name");
		String address  = req.getParameter("address");
		Customer c = new Customer(num, name, address);
		bean.insert(c);
		
		req.setAttribute("c", c);
		
		//forward ������� jsp�� ��ȯ
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/customer/insertSuccess.jsp");		
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(HttpServletRequest req, HttpServletResponse res) {
		String num = req.getParameter("num");
		bean.delete(num);
		list(req,res);
	}

	public void loginProcess(HttpServletRequest req, HttpServletResponse res) {//�α��� ó�� ��û
		//Ŭ���̾�Ʈ�� �Է��� id�� �޾ƿͼ� ���ǿ� �����Ŵ
		String id = req.getParameter("id"); //db���� üũ�ϴ� ���� ����
		HttpSession session = req.getSession(); //session�� ������
		session.setAttribute("id", id); //session�� ����
		String cpage = (String)session.getAttribute("cpage"); // list.cus�� insert.cus �߿� ���� �ִ� ������ ���ư���.
		
		try {
			res.sendRedirect(cpage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void login(HttpServletRequest req, HttpServletResponse res) {//�α��� ȭ�� ��û
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/customer/login.jsp");		
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void logout(HttpServletRequest req, HttpServletResponse res) {//�α׾ƿ� ��û
		HttpSession session = req.getSession(); //session�� ������
		session.setAttribute("id", null); //session���� �����
		
		try {
			res.sendRedirect("list.cus"); //�ʱ�ȭ������
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
