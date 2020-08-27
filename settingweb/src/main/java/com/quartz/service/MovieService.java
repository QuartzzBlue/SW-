package com.quartz.service;

import java.util.List;

import com.quartz.vo.MovieVO;

public interface MovieService {
	public List<MovieVO> selectMovie() throws Exception;
}
