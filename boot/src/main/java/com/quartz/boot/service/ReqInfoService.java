package com.quartz.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quartz.boot.mapper.ReqInfoMapper;
import com.quartz.boot.vo.RequestInfoVO;


@Service
public class ReqInfoService {

	@Autowired
	private ReqInfoMapper reqInfoMapper;
	
	public List<RequestInfoVO> selectLCByYear(String yy) throws Exception {
		return reqInfoMapper.selectLCByYear(yy);
	}

}
