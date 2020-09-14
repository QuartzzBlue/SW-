package com.quartz.boot.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quartz.boot.service.ReqInfoService;
import com.quartz.boot.vo.RequestInfoVO;


@RestController
@RequestMapping("api/login-cnt")
public class LoginCntController {
	
	@Autowired
	private ReqInfoService reqInfoService;
	
	//연도 별 총 로그인 수
	@RequestMapping(value = "/by-year/{year}", method = RequestMethod.GET)
	public HashMap<String, Object> getLCbyYear(@PathVariable("year") String year){
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
	
	
	@RequestMapping(value = "/by-month/{condition}", method = RequestMethod.GET)
	public HashMap<String, Object> getLCbyMonth(
								@PathVariable("condition") String condition,
								@RequestParam(value = "begin-month", required = true) String beginMonth,
								@RequestParam(value = "end-month", required = true) String endMonth){
		if(condition.equals("day-avg")) {
			
		}else if(condition.equals("by-deft")) {
			
		}else if(condition.equals("exc-holiday")) {
			
		}else {
			return 
		}
		
		
		
		return null;
	}


}
