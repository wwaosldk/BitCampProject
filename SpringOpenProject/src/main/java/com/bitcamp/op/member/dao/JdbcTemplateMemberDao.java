package com.bitcamp.op.member.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bitcamp.op.member.model.Userset;

public class JdbcTemplateMemberDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Userset selectById(String userId) {

		Userset resultObj = null;
		String sql = "select * from member where id=?";

		// List<MemberVo> result = jdbcTemplate.query(sql, new MemberRowMapper(),
		// userId);
		// resultObj = result.isEmpty() ? nuinsertMemberinsertMemberll : result.get(0);

		resultObj = jdbcTemplate.queryForObject(sql, new MemberRowMapper(), userId);

		return resultObj;

	}

	public int insertMember(Userset member) {

		int resultCnt = 0;

		String sql = "insert into member " 
				+ " (mIdx, id, password, name, photo ) "
				+ " values (member_seq.nextval, ?,?,?,?) ";

		resultCnt = jdbcTemplate.update(
				sql, 
				member.getId(), 
				member.getPassword(), 
				member.getName(),
				member.getMemberPhoto());

		return resultCnt;

	}

}
