package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.IEmployeeDao;
import com.example.demo.pojo.Employee;

@Controller
public class TestController {

	@Autowired
	private IEmployeeDao dao;
	
	@RequestMapping(value="/healthCheck", method=RequestMethod.GET)
	public String healthCheck() {
		return "success";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcomePage() {
		return "index";
	}
	
	@RequestMapping(value="/saveName", method=RequestMethod.POST)
	public String saveUserName(Employee emp) {
		dao.save(emp);
		return "success";
	}
	
	
}
