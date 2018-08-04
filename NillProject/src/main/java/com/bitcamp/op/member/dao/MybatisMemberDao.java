package com.bitcamp.op.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.bitcamp.op.member.model.Userset;

public class MybatisMemberDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public Userset selectById(String userid) {
		String str = "com.bitcamp.op.mapper.mybatis.MemberMapper.selectById";
		return (Userset) sqlSessionTemplate.selectOne(str, userid);
	}
	
	public void insert(Userset user) {
		String str = "com.bitcamp.op.mapper.mybatis.MemberMapper.insertMember";
		int num = sqlSessionTemplate.update(str, user);
		System.out.println(num);
	}
}
