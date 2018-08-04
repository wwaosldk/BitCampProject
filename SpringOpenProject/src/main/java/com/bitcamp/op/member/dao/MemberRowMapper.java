package com.bitcamp.op.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bitcamp.op.member.model.Userset;

public class MemberRowMapper implements RowMapper<Userset> {

	@Override
	public Userset mapRow(ResultSet rs, int rowNum) throws SQLException {
		Userset Userset = new Userset();
		Userset.setmIdx(rs.getInt(1));
		Userset.setId(rs.getString(2));
		Userset.setPassword(rs.getString(3));
		Userset.setName(rs.getString(4));
		Userset.setBirth(rs.getString(5));
		Userset.setGender(rs.getString(6));
		Userset.setCheckemail(rs.getString(7));
		Userset.setPhone(rs.getString(8));
		Userset.setMemberPhoto(rs.getString(9));
		return Userset;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
