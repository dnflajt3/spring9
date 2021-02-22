package com.rup.spring8.dao;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.rup.spring8.dto.ContentDto;

public interface IDao {
	 public ArrayList<ContentDto> listDao();
	 
	 public void writeDao(final String mWriter,final String mContent) ;
	 
	 public void deleteDao(final String bId) ;
}
