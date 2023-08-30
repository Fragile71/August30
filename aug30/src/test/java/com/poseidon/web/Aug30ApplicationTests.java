package com.poseidon.web;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.poseidon.web.dto.LoginDTO;
import com.poseidon.web.service.LoginService;

@SpringBootTest
class Aug30ApplicationTests {

	//Junit = 자바에서 독립된 단위테스트를 지원해주는 프레임 워크
	
	@Autowired
	LoginService loginService;
	
	@Test
	@DisplayName("처음 테스트 해봐요")
	void contextLoads() {
		//DTO에 값을 담아서 DB에 물어보면 정말 값이 와요?
		LoginDTO dto = new LoginDTO();
		dto.setId("mingming");
		dto.setPw("01234567");
		
		
		LoginDTO result = loginService.login(dto);
	
	
     	assertEquals(result.getM_name(), "상민");
     //	assertNotNull(result);
	}



}
