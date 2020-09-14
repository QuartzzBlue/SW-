package com.quartz.boot.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Term {
	
	@Getter @Setter
	private String startDate;
	@Getter @Setter
	private String endDate;
	
}
