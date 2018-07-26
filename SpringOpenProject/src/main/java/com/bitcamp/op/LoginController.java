package com.bitcamp.op;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/naverLogin")
	public String index() {
		return "naverLogin";
	}

}
