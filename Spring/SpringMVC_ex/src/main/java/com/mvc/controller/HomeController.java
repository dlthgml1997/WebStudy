package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {	
	//Ŭ���̾�Ʈ�κ��� get ������� /home.do��û�� ������ �� ������ ����� ���� �޼ҵ�
	//���� �޼ҵ��� ����Ÿ��:String(������ view �̸�)
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Model model) {		
		//Model: map������ �����͸� �����ϰ� view���� ������ ���� ����
		model.addAttribute("city", "seoul" );
		model.addAttribute("code", "12345" );
		
		return "home";//���� view �̸�
	}
	//Ŭ���̾�Ʈ�κ��� get ������� /test.do��û�� ������ �� ������ ����� ���� �޼ҵ�
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String test( Model model) {		
		
		model.addAttribute("name", "tommy lee" );
		
		return "test";
	}
	
}










