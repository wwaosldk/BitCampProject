package com.bitcamp.op.member.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.op.member.service.LoginRequest;
import com.bitcamp.op.member.service.MemberLoginService;

@Controller()
public class LoginController {
	
	@Autowired
	MemberLoginService memberLoginService;
	
	@RequestMapping(value = "user/naverLogin")
	public String totheLogin() {
		return "redirect:/naverLogin";
	}
	
	@RequestMapping(value = "user/successLogout")
	public String successLogout() {
		return "user/successLogout";
	}

	@RequestMapping(value = "/naverLogin", method = RequestMethod.GET)
	public String toLogin() {
		return "user/naverLogin";
	}

	@RequestMapping(value = "/naverLogin", method = RequestMethod.POST)
	public String processLogin(HttpServletRequest request, @RequestParam("id") String id,
			@RequestParam("password") String password, LoginRequest loginRequest, Model model) throws SQLException {
		String userid = request.getParameter("id");
		String pw = request.getParameter("password");
		
		//////////////////////////////////////////////////////

		// model 처리
		memberLoginService.login(request, userid, pw);

		model.addAttribute("userid", userid);
		model.addAttribute("password", pw);
		////////////////////////////////////////////////////

		model.addAttribute("id", userid);
		model.addAttribute("password", password);
		model.addAttribute("loginChk", true);
		return "user/loginOk";
	}

}
