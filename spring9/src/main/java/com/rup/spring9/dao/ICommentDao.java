 package com.rup.spring9.dao;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.rup.spring9.dto.CommentDto;
import com.rup.spring9.dto.PostDto;

public interface ICommentDao {
	 public void create(final int parentPostId,final int writerMemberId,final String content);
	 public void delete(final int id);
	 public ArrayList<CommentDto> findAll(final int parentPostId);
}
