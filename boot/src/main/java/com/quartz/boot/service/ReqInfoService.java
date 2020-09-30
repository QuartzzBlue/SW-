package com.quartz.boot.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quartz.boot.excel.Poi;
import com.quartz.boot.exception.DateFormatException;
import com.quartz.boot.mapper.ReqInfoMapper;
import com.quartz.boot.vo.DeptLCResponseVO;
import com.quartz.boot.vo.DoubleResponseVO;
import com.quartz.boot.vo.IntResponseVO;
import com.quartz.boot.vo.RequestInfoVO;
import com.quartz.boot.vo.Term;


@Service
public class ReqInfoService {
	
	@Autowired
	private Poi poi;
	
	@Autowired
	private ReqInfoMapper reqInfoMapper;
	
	public List<RequestInfoVO> selectLCByYear(String yy) throws Exception {
		return reqInfoMapper.selectLCByYear(yy);
	}
	
	public HashMap<String, Object> selectDeptLCByMonth(String yearmonth) throws Exception {
		HashMap<String, Object> response = new HashMap<String, Object>();
		for(int i = 0; i < yearmonth.length(); i++) {
			if(Character.isDigit(yearmonth.charAt(i)) == false || i >= 6) {
				throw new DateFormatException(String.format("[%S] is not valid", yearmonth));
			}
		}
		
		List<DeptLCResponseVO> list = reqInfoMapper.selectDeptLCByMonth(yearmonth);;
		response.put("status", "200");
		response.put("description", "월별 부서 로그인 수");
		response.put("month", yearmonth);
		response.put("dataSize", list.size());
		response.put("data", list);
		
		poi.writeExcel(response);
		return response;
	}

	public HashMap<String, Object> selectDayAvgLCByMonth(Term term) throws Exception{
		HashMap<String, Object> response = new HashMap<String, Object>();
		List<DoubleResponseVO> list = reqInfoMapper.selectDayAvgLCByMonth(term);
		response.put("status", "200");
		response.put("description", "월별 일평균 로그인 수");
		response.put("beginMonth", term.getStartDate());
		response.put("endMonth", term.getEndDate());
		response.put("dataSize", list.size());
		response.put("data", list);
		
		poi.writeExcel(response);
		return response;
	}
	
	public HashMap<String, Object> selectExcOffDayLCByMonth(Term term) throws Exception{
		HashMap<String, Object> response = new HashMap<String, Object>();
		List<IntResponseVO> list = reqInfoMapper.selectExcOffDayLCByMonth(term);
		response.put("status", "200");
		response.put("description", "월별 휴일 제외 로그인 수");
		response.put("beginMonth", term.getStartDate());
		response.put("endMonth", term.getEndDate());
		response.put("dataSize", list.size());
		response.put("data", list);
		
		poi.writeExcel(response);
		return response;
	}
	
	public HashMap<String, Object> selectCUByday(Term term) throws Exception{
		HashMap<String, Object> response = new HashMap<String, Object>();
		List<IntResponseVO> list = reqInfoMapper.selectCUByday(term);
		response.put("status", "200");
		response.put("description", "일별 접속자 수");
		response.put("beginMonth", term.getStartDate());
		response.put("endMonth", term.getEndDate());
		response.put("dataSize", list.size());
		response.put("data", list);
		
		poi.writeExcel(response);
		return response;
	}
}
