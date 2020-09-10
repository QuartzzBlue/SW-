package com.quartz.boot.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quartz.boot.service.ReqInfoService;
import com.quartz.boot.vo.RequestInfoVO;


@RestController
@RequestMapping("/login-cnt")
public class LoginCntController {
	
	@Autowired
	private ReqInfoService reqInfoService;
	
	@RequestMapping(value = "/by-year/{year}", method = RequestMethod.GET)
	public HashMap<String, Object> byYearLC(@PathVariable("year") String year){
		HashMap<String, Object> response = new HashMap<String, Object>();
		
		List<RequestInfoVO> list = null;
		try {
			list = reqInfoService.selectLCByYear(year);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		response.put("totCnt", list.size());
		response.put("year", year);
		response.put("isSuccess", true);
		System.out.println(response.toString());
		return response;
	}
	
	@RequestMapping("/by-day/avg")
	public HashMap<String, Object> byDayAvgLC() {
		
		return null;
	}
	
	@RequestMapping("/by-month/by-dept")
	public HashMap<String, Object> byMonthByDeptLC() {
		
		return null;
	}
}
