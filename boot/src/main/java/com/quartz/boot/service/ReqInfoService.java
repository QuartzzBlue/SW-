package com.quartz.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quartz.boot.mapper.ReqInfoMapper;
import com.quartz.boot.vo.RequestInfoVO;
import com.quartz.boot.vo.Term;


@Service
public class ReqInfoService {

	@Autowired
	private ReqInfoMapper reqInfoMapper;
	
	public List<RequestInfoVO> selectLCByYear(String yy) throws Exception {
		return reqInfoMapper.selectLCByYear(yy);
	}
	
	public List<RequestInfoVO> selectLCByMonthByDept(Term term) throws Exception {
		return reqInfoMapper.selectLCByMonthByDept(term);
	}

	public List<RequestInfoVO> selectLCByMonthDayAvg(Term term) throws Exception{
		return reqInfoMapper.selectLCByMonthDayAvg(term);
	}
	
	public List<RequestInfoVO> selectLCByMonthExcHoliday(Term term) throws Exception{
		return reqInfoMapper.selectLCByMonthExcHoliday(term);
	}
	
	public List<RequestInfoVO> selectCUByday(Term term) throws Exception{
		return reqInfoMapper.selectCUByday(term);
	}
}
