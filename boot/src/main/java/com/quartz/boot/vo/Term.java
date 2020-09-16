package com.quartz.boot.vo;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Term {
	
//	@Pattern(regexp = "[0-9]{6}")
	@NotBlank(message = "날짜는 필수 입력 값입니다.")
	private String startDate;
	
//	@Pattern(regexp = "[0-9]{6}")
	@NotBlank(message = "날짜는 필수 입력 값입니다.")
	private String endDate;
}
