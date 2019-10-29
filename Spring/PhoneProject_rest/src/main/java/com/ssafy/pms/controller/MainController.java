package com.ssafy.pms.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.pms.dto.Phone;
import com.ssafy.pms.dto.UserInfo;
import com.ssafy.pms.service.IPhoneService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	IPhoneService service;
	
	@GetMapping("regPhone.do")
	public String getRegPhone(Model model) {
		model.addAttribute("title", "�ڵ��� ����-�ڵ��� ���");
		return "PhoneReg";
	}

	@PostMapping("regPhone.do")
	public String doRegPhone(Phone phone, Model model) {
		try {
			service.insert(phone);
			model.addAttribute("title", "�ڵ��� ����-��ϼ���");
			return "Result";
		}catch(RuntimeException e) {
			logger.error("����Ͻ���", e);
			model.addAttribute("title", "�ڵ��� ����-����");
			model.addAttribute("message", "���� ���� - ���� �� ������ �߻��߽��ϴ�.");
			return "Error";
		}
	}
	
	@GetMapping("searchPhone.do")
	public String doList(Model model) {
		try {
			List<Phone> list = service.select();
			model.addAttribute("title", "�ڵ��� ����-����Ʈ");
			model.addAttribute("phones", list);
			return "PhoneList";
		}catch(RuntimeException e) {
			logger.error("�� ��� ��ȸ ����", e);
			model.addAttribute("title", "�ڵ��� ����-����");
			model.addAttribute("message", "���� ���� - �����ȸ �� ������ �߻��߽��ϴ�.");
			return "Error";
		}
	}
	
	@GetMapping("detail.do")
	public String doDetail(Phone phone, Model model) {
		try {
			Phone selected = service.select(phone);
			model.addAttribute("title", "�ڵ��� ����-�ڵ��� ��ȸ");
			model.addAttribute("phone", selected);
			return "PhoneView";
		}catch(RuntimeException e) {
			logger.error("����ȸ����", e);
			model.addAttribute("title", "�ڵ��� ����-����");
			model.addAttribute("message", "���� ���� - ��ȸ �� ������ �߻��߽��ϴ�.");
			return "Error";
		}
	}
	
	@GetMapping("delete.do")
	public String doDelete(@RequestParam List<String> num, Model model) {
		try {
			service.delete(num);
			return "redirect:searchPhone.do";
		}catch(RuntimeException e) {
			logger.error("����������", e);
			model.addAttribute("title", "�ڵ��� ����-����");
			model.addAttribute("message", "���� ���� - ���� �� ������ �߻��߽��ϴ�.");
			return "Error";
		}
	}
	
	@GetMapping("login.do")
	public String getLoginForm() {
		return "Login";
	}
	
	@PostMapping("login.do")
	public String doLogin(UserInfo user, Model model, HttpSession session) {
		try {
			
			UserInfo selected = service.select(user);
			logger.info("user: {}", selected);
			if(selected!=null) {
				session.setAttribute("loginUser", selected);
				return "redirect:searchPhone.do";
			}else {
				return "Login";
			}
		}catch(RuntimeException e) {
			logger.error("�α��� ����", e);
			model.addAttribute("title", "�ڵ��� ����-�α��� ����");
			model.addAttribute("message", "���� ���� - �α��� �� ������ �߻��߽��ϴ�.");
			return "Error";
		}
	}
	
	@GetMapping("rest.do")
	public String getRestClient() {
		return "rest";
	}
	
}
