package com.test.board.login.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.board.login.service.LoginService;

@Controller
public class LoginController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		return "login/loginForm";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginProcess(@RequestParam HashMap<String, Object> param, HttpSession session) {
		
		HashMap<String, Object> resultMap = loginService.compareIdPw(param);

		//no result -> login failed
		if(resultMap == null) {
			return "login/loginFail";
		}

		logger.info(resultMap.toString());
		//create session after login success
		session.setAttribute("loginUserInSession", resultMap);
		
		return "redirect:/main";
	}
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String main() {
		
		return "main/main";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session != null) {
			session.invalidate();
		}
		return "login/logout";
	}
	
	@RequestMapping(value="/accessError", method = RequestMethod.GET)
	public String accessError() {
		return "error/accessError";
	}
	
}
