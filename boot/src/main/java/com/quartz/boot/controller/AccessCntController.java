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

	//일별 접속자 수
	@RequestMapping(value = "/day", method = RequestMethod.GET)
	public HashMap<String, Object> getCUbyDay(
									@RequestParam(value = "begin-month", required = true) String beginMonth,
									@RequestParam(value = "end-month", required = true) String endMonth) throws Exception{
		
		Term term = new Term(beginMonth, endMonth);

		return reqInfoService.selectCUByday(term);
	}
}
