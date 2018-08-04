package com.bitcamp.op.member.service;

import java.io.File;
import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.bitcamp.op.jdbc.ConnectionProvider;
import com.bitcamp.op.jdbc.JdbcUtil;
import com.bitcamp.op.member.dao.UserDAO;
import com.bitcamp.op.member.model.Userset;



public class MemberRegService {
	
	@Autowired
	UserDAO memberDao;

	public int RegMember(Userset memberVo, HttpServletRequest request) throws Exception {
		int result = 0;		
		Connection conn = null;
		// 저장용 파일이름 , 물리적저장, DB 저장용
		String imgName = "";

		// 물리적인 저장
		
		// 1. 저장 경로 설정
		String uploadUri = "/uploadFile/memberPhoto";
		// 2. 시스템의 물리적인 경로 
		String dir = request.getSession().getServletContext().getRealPath(uploadUri);
		System.out.println(dir);
		
		// 사용자의 업로드 파일을 물리적으로 저장
		if(!memberVo.getPhotoFile().isEmpty()) {
			//imgName = System.currentTimeMillis()+memberVo.getPhotoFile().getOriginalFilename();
			imgName = memberVo.getId()+"_"+memberVo.getPhotoFile().getOriginalFilename();
			// cool + _ + mini.jpg
			
			// 저장
			memberVo.getPhotoFile().transferTo(new File(dir, imgName));
			// DB에 저장할 파일 이름을 SET
			memberVo.setMemberPhoto(imgName);
		}
		
		
		
		try {
			conn = ConnectionProvider.getConnection();
			result = memberDao.join(conn, memberVo);
			
		} finally {
			JdbcUtil.close(conn);
		}

		return result;
	}

}
