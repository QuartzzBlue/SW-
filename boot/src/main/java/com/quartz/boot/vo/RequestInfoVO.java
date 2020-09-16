package com.quartz.boot.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestInfoVO {
	
	private Long requestID;
	@Setter 
	private String requestCode;
	@Setter 
	private String userID;
	@Setter 
	private String createDate;
	
}
