package com.quartz.boot.controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quartz.boot.excel.Poi;
import com.quartz.boot.service.ReqInfoService;
import com.quartz.boot.vo.IntResponseVO;
import com.quartz.boot.vo.Term;

@RestController
@RequestMapping("api/v2/access-cnt")
public class AccessCntController {
	
	@Autowired
	private ReqInfoService reqInfoService;
	
	@Autowired
	private Poi poi;
	
	@Pattern(regexp = "^[0-9]{6}$")
	private static String valid_regex;

	
	//일별 접속자 수
	@RequestMapping(value = "/day", method = RequestMethod.GET)
	public HashMap<String, Object> getCUbyDay(
									@RequestParam(value = "begin-month", required = true) String beginMonth,
									@RequestParam(value = "end-month", required = true) String endMonth){

		HashMap<String, Object> response = new HashMap<String, Object>();
		Term term = new Term(beginMonth, endMonth);
		List<IntResponseVO> list = null;
		try {
			list = reqInfoService.selectCUByday(term);
			response.put("status", "200");
			response.put("description", "일별 접속자 수");
			response.put("beginMonth", beginMonth);
			response.put("endMonth", endMonth);
			response.put("dataSize", list.size());
			response.put("data", list);
//			for(AccessCntResponseVO a : list) {
//				System.out.println(a.toString());
//			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		poi.writeExcel(response);
		
		return response;
	}
}
