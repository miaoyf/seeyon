package com.seeyon.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seeyon.manager.PersonManager;
import com.seeyon.vo.Person;


@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	PersonManager personManager;
	
	@RequestMapping(value="start.do",method={RequestMethod.GET})
	public String startMVC (HttpServletRequest request,ModelMap modelMap){
		
		Person person = new Person(request.getParameter("name"),request.getParameter("pwd"));
		person.setId(Integer.parseInt(request.getParameter("id").toString()));
		personManager.save(person);
		System.out.println(person.getId());
		System.out.println(person.getName());
		modelMap.put("person",person);
		
		return "NewFile";
	}
	@RequestMapping(value="addUser.do",method={RequestMethod.GET})
	public String  addUser(HttpServletRequest request,HttpServletResponse response){
		String userName=request.getParameter("userName");
		String pwd=request.getParameter("pwd");
		Person person = new Person(userName,pwd);
		person.setName(userName);
		person.setPwd(pwd);
		personManager.save(person);
		return "/WEB-INF/jsp/sucess.jsp";
	}
	@RequestMapping(value="login.do",method={RequestMethod.GET})
	public String login(HttpServletRequest request,HttpServletResponse response){
		String userName=request.getParameter("userName");
		String pwd=request.getParameter("pwd");
		Person person=personManager.getPerson(userName);
		if(person!=null&&person.getName().equals(pwd)){
			return "/WEB-INF/jsp/login/success.jsp";
		}
		return "/WEB-INF/jsp/login/error.jsp";
	}

}
