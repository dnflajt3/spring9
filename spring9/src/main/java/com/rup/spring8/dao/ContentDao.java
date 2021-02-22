package com.rup.spring8.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.rup.spring8.dto.ContentDto;

public class ContentDao implements IDao {
	 JdbcTemplate template;
	 
	 public void setTemplate(JdbcTemplate template) {
		 this.template=template;
	 }
	 
	 public ArrayList<ContentDto> listDao(){
		 String query="select * from board order by mId desc";
		 ArrayList<ContentDto> dtos=(ArrayList<ContentDto>) template.query(query, new BeanPropertyRowMapper());
		 return dtos;
	 }
	 
	 public void writeDao(final String mWriter,final String mContent) {
		 System.out.println("writeDao()");
		 
		 String query="insert into board (mId,mWriter,mContent) values (board_seq.nextval,?,?)";
		 
		 this.template.update(query,mWriter,mContent);
		
	 }
	 
	 public void deleteDao(final String bId) {
		 System.out.println("deleteDao()");
		 
		 String query="delete from board where mId= ?";
		 
		 this.template.update(query,bId);
	 }
}
