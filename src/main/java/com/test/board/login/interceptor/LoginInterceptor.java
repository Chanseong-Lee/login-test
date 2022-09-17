package com.test.board.login.interceptor;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//session check
		HttpSession session = request.getSession(false);
		if(session == null) {
			response.sendRedirect("/accessError");
			return false;
		}
		
		HashMap<String, Object> loginUserInSession = (HashMap<String, Object>) session.getAttribute("loginUserInSession");
		logger.info("현재 세션 정보 : " + String.valueOf(loginUserInSession));
		if(loginUserInSession == null) {
			response.sendRedirect("/accessError");
			return false;
		}
		
		return true;
	}
}
