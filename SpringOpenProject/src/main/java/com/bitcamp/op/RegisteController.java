package com.bitcamp.op;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisteController {
	
	@RequestMapping("/naverRegi")
	public String index() {
		return "naverRegi";
	}

}
