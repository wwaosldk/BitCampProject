package com.bitcamp.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MypageController {
	
	@RequestMapping(value="mypage")
	public String toGallery() {
		return "redirect:/mp";
	}
	
	@RequestMapping(value="/mp")
	public String getGallery() {
		return "mypage/mypage";
	}
}
