package com.quartz.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.quartz.vo.MovieVO;

@Repository
public class MovieDAOImpl implements MovieDAO {
	
	@Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.quartz.mybatis.sql.test";
    
    @Override
	public List<MovieVO> selectMovie() throws Exception {
		
		return sqlSession.selectList(Namespace+".selectMovie");
	}

}
