package com.quartz.boot.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RequestInfoVO {
	

	private Long requestID;
	@Setter 
	private String requestCode;
	@Setter 
	private String userID;
	@Setter 
	private String createDate;
	

	@Override
	public String toString() {
		return "RequestInfoVO [requestID=" + requestID + ", requestCode=" + requestCode + ", userID=" + userID
				+ ", createDate=" + createDate + "]";
	}
	
	
	
}
