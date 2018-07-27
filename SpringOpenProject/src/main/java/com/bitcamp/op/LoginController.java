package com.bitcamp.op;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller()
public class LoginController {
	
	@RequestMapping(value="/naverLogin", method=RequestMethod.GET)
	public String toLogin() {
		return "user/naverLogin";
	}
	
	@RequestMapping(value="/naverLogin", method=RequestMethod.POST)
	public String successLogin(
			LoginInfo info,		//3. 객체를 이용해서 데이터 받기
			Model model
			) {
		return "user/loginOk";
	}

}
