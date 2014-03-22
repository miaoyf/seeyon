package com.seeyon.manager.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.seeyon.vo.Person;

public class PersonRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person user=new Person(rs.getString("name"),rs.getString("pwd"));
		return user;
	}

}
