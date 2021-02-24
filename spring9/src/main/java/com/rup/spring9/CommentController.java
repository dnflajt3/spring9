package com.rup.spring9;

import java.awt.Dimension;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rup.spring9.dao.ICommentDao;
import com.rup.spring9.dao.IPostDao;


/**
 * Handles requests for the application home page.
 */
@Controller
public class CommentController {
	

	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(CommentController.class);
	

	@RequestMapping("/list")
	public String list( Model model) {
		ICommentDao dao=  sqlSession.getMapper(ICommentDao.class);
		return "list";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request) {
		
		IPostDao dao=  sqlSession.getMapper(IPostDao.class);
		dao.create(request.getParameter("mWriter"),request.getParameter("mContent"));
		return "redirect:list";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		
		
		IPostDao dao=  sqlSession.getMapper(IPostDao.class);
		dao.delete(request.getParameter("mId"));
		return "redirect:list";
		
	}	
	

	

}
