package com.bitcamp.op;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CssController {
	
	@RequestMapping("/naverCss")
	public String index() {
		return "naverCss";
	}

}
