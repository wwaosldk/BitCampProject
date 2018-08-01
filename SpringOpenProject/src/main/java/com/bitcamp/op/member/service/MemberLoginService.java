package com.bitcamp.op.member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.bitcamp.op.jdbc.ConnectionProvider;
import com.bitcamp.op.jdbc.JdbcUtil;
import com.bitcamp.op.member.dao.JdbcTemplateMemberDao;
import com.bitcamp.op.member.dao.MemberDaoInterface;
import com.bitcamp.op.member.dao.UserDAO;
import com.bitcamp.op.member.model.Userset;



public class MemberLoginService {

	//@Autowired
	//MemberDao memberDao;
	
	@Autowired
	SqlSessionTemplate template;
	
	private MemberDaoInterface memberDao;
	
	public boolean login(HttpServletRequest request, String id, String password) throws SQLException {
		
		memberDao = template.getMapper(MemberDaoInterface.class);
		
		boolean result = false;
		HttpSession session = request.getSession(false);
		System.out.println("1");
		//Connection conn = null;
		

		/*try {*/
			//conn = ConnectionProvider.getConnection();

			//MemberVo memberVo = memberDao.selectById(conn, userId);
			Userset memberVo = memberDao.selectById(id);
			System.out.println("2");
			System.out.println(memberDao);
			System.out.println("memberVo는 "+memberVo);
			if (memberVo != null && memberVo.isMatchPassword(password)) {
				System.out.println("3");
				session.setAttribute("loginInfo", memberVo);
				System.out.println("로그인 성공");
				result = true;
			}
		/*} finally {
			JdbcUtil.close(conn);
		}*/
			System.out.println("4");
		return result;
	}

}
