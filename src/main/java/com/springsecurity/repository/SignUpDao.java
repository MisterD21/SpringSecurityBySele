package com.springsecurity.repository;

import com.springsecurity.dto.SignUpDto;

public interface SignUpDao {

	void saveUser(SignUpDto signUpDto);
}
