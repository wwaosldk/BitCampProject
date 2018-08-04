package com.bitcamp.op.member.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.op.member.dao.UserDAO;


@Controller
public class RegiCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@RequestMapping("RegiCheck")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String userID =request.getParameter("id");
		response.getWriter().write( UserDAO.getInstance().registerCheck(userID)+"");
		
		
	}

}
