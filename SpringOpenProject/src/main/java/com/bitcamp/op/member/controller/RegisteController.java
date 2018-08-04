package com.bitcamp.op.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bitcamp.op.member.model.Userset;
import com.bitcamp.op.member.service.MemberRegService;

@Controller
public class RegisteController {
	@Autowired
	MemberRegService memberRegService;

	@RequestMapping(value = "naverAgree")
	public String successLogout() {
		return "/user/naverAgree";
	}
	
	@RequestMapping(value="user/naverRegi",method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		String viewName = "user/naverRegi";
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	/*@RequestMapping(method = RequestMethod.POST)
	public String toRegiOk() {
		return "user/regiOk";
	}*/
	
	@RequestMapping(value="user/naverRegi", method = RequestMethod.POST)
	public ModelAndView processLogin(Userset member, HttpServletRequest request) throws Exception {
		
		System.out.println("dddd");
		String viewName = "user/regiOk";
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(viewName);

		int insertCnt = memberRegService.RegMember(member, request);

		modelAndView.addObject("insertCnt", insertCnt);


		return modelAndView;
	}

	

}
