package com.seeyon.manager.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.seeyon.manager.PersonManager;
import com.seeyon.vo.Person;

public class PersonManagerImpl implements PersonManager{

	private JdbcTemplate jdbcTemplate;
	
	public void save(Person person) {
		jdbcTemplate.update("insert into person values(?,?,?)",new Object[]{person.getId(),person.getName(),person.getPwd()}); 
	}

	public void del(Person person) {
		// TODO Auto-generated method stub
		
	}

	public void update(Person person) {
		// TODO Auto-generated method stub
		
	}

	public void searchAll() {
		// TODO Auto-generated method stub
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Person getPerson(String userName) {
		String sql="select * from person where name=?";
		Object[] args=new Object[]{userName};
		return this.jdbcTemplate.queryForObject(sql, args, new PersonRowMapper());
	}

}
