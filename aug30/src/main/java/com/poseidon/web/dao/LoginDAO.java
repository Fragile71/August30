package com.poseidon.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.poseidon.web.dto.BoardDTO;
import com.poseidon.web.dto.LoginDTO;

@Mapper
public interface LoginDAO {

	BoardDTO list();


	LoginDTO login(LoginDTO dto);
}
