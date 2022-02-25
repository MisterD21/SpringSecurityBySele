package com.springsecurity.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springsecurity.dto.SignUpDto;

@Repository
public class SignUpDaoImpl implements SignUpDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void saveUser(SignUpDto signUpDto) {
		
		String sql = "insert into users values(?, ?, ?)";
		String sql2 = "insert into authorities values(?, ?)";
		jdbcTemplate.update(sql, signUpDto.getUsername(), signUpDto.getPassword(), 1);
		jdbcTemplate.update(sql2, signUpDto.getUsername(), "USER");

	}

}
