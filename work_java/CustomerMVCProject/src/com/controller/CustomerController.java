package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Customer;
import com.dao.CustomerDAO;
import com.dao.ICustomerDAO;

//Front Controller���� �Ѿ�� ��û�� Model���� �Ѱܼ� �۾� ����
//Model�� �۾� �� ����� �޾Ƽ� ������ �Ŀ� jsp�� �Ѿ� ��(forward).pojo
public class CustomerController {
	ICustomerDAO bean;
	
	public CustomerController(){
		bean = new CustomerDAO();
	}
	
	public void list(HttpServletRequest req, HttpServletResponse res) {
		ArrayList<Customer> list = bean.selectAll();
		req.setAttribute("list", list);//jsp���� �����ؼ� ����ϵ��� ����
		
		//forward ������� jsp�� ��ȯ
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/customer/list.jsp");		
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
		req.setAttribute("c", c); //req�� �ְ�
		
		//forward ������� jsp�� ��ȯ
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/customer/read.jsp");		
		try {
			dispatcher.forward(req, res);//jsp�� forward ��Ŵ
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void insertForm(HttpServletRequest req, HttpServletResponse res) {
		//�Է��ϴ� ȭ���� �߰� �Ѵ�(db�� �ִ� �۾� ����)
		try {
			res.sendRedirect("/customer/insertForm.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insert(HttpServletRequest req, HttpServletResponse res) {
		//num, name, address�ޱ�
		//db�� insert
		String num = req.getParameter("num"); //�̸��� num���� �����Ͽ���
		String name = req.getParameter("name"); //�̸��� num���� �����Ͽ���
		String address  = req.getParameter("address"); //�̸��� num���� �����Ͽ���
		Customer c = new Customer(num, name, address);
		bean.insert(c);
		
		req.setAttribute("c", c);
		
		//forward ������� jsp�� ��ȯ
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/customer/insertSuccess.jsp");		
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		
	}
}
