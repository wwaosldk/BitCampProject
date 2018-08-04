package com.bitcamp.op.member.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("인터셉터 진입....");
		HttpSession session = request.getSession(false);
		
		if ( session != null ) {
			if(session.getAttribute("loginInfo") != null) {
				
				System.out.println("check..............1111");
				return true;
			}
		}
		
		response.sendRedirect(request.getContextPath()+"/member/login?url=");
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
