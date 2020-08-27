package com.quartz.dao;

import java.util.List;

import com.quartz.vo.MovieVO;

public interface MovieDAO {
	
	 public List<MovieVO> selectMovie() throws Exception;
}
