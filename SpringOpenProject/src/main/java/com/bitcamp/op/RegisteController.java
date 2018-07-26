package com.bitcamp.op;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegisteController {
	
	@RequestMapping( value="/naverRegi", method=RequestMethod.GET)
	public String toRegi() {
		return "naverRegi";
	}
	
	
	
	@RequestMapping( value="/naverRegi", method=RequestMethod.POST)
	public String successRegi(
			RegiInfo info,
			Model model
			) {
		
		return "regiOk";
	}

}
