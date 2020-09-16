package com.quartz.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quartz.boot.mapper.ReqInfoMapper;
import com.quartz.boot.vo.DeptLCResponseVO;
import com.quartz.boot.vo.DoubleResponseVO;
import com.quartz.boot.vo.IntResponseVO;
import com.quartz.boot.vo.RequestInfoVO;
import com.quartz.boot.vo.Term;


@Service
public class ReqInfoService {

	@Autowired
	private ReqInfoMapper reqInfoMapper;
	
	public List<RequestInfoVO> selectLCByYear(String yy) throws Exception {
		return reqInfoMapper.selectLCByYear(yy);
	}
	
	public List<DeptLCResponseVO> selectDeptLCByMonth(String yyMM) throws Exception {
		return reqInfoMapper.selectDeptLCByMonth(yyMM);
	}

	public List<DoubleResponseVO> selectDayAvgLCByMonth(Term term) throws Exception{
		return reqInfoMapper.selectDayAvgLCByMonth(term);
	}
	
	public List<IntResponseVO> selectExcOffDayLCByMonth(Term term) throws Exception{
		return reqInfoMapper.selectExcOffDayLCByMonth(term);
	}
	
	public List<IntResponseVO> selectCUByday(Term term) throws Exception{
		return reqInfoMapper.selectCUByday(term);
	}
}
