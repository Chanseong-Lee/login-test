package com.test.board.login.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.board.login.mapper.LoginMapper;

@Service
public class LoginService {
	
	@Autowired
	LoginMapper loginMapper;
	
	public HashMap<String, Object> compareIdPw(HashMap<String, Object> param) {
		return loginMapper.selectIdPw(param);
	}
}
