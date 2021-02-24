 package com.rup.spring9.dao;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.rup.spring9.dto.MemberDto;
import com.rup.spring9.dto.PostDto;

public interface IMemberDao {
	 public void create(final String email,final String password,final String nickname);
}
 