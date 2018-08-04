package com.bitcamp.op.member.dao;

import com.bitcamp.op.member.model.Userset;

public interface MemberDaoInterface {
	public Userset selectById(String id);
	public int insertMember(Userset naver_user);
}
