 package com.rup.spring9.dao;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.rup.spring9.dto.PostDto;

public interface IPostDao {
	 public void create(final String Writer,final String Content) ;
	 public void delete(final String id) ;
	 public ArrayList<PostDto> findAll();
	
}
