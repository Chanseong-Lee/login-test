package com.test.board.login.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
	public HashMap<String, Object> selectIdPw(HashMap<String, Object> param);
}
