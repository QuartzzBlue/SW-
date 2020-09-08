package com.quartz.boot.vo;

import org.springframework.stereotype.Component;

public class RequestInfoVO {
	
	private Long requestID;
	private String requestCode;
	private String userID;
	private String createDate;
	
	public RequestInfoVO() {}
	
	public RequestInfoVO(Long requestID, String requestCode, String userID, String createDate) {
		this.requestID = requestID;
		this.requestCode = requestCode;
		this.userID = userID;
		this.createDate = createDate;
	}

	public Long getRequestID() {
		return requestID;
	}

	public void setRequestID(Long requestID) {
		this.requestID = requestID;
	}

	public String getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "RequestInfoVO [requestID=" + requestID + ", requestCode=" + requestCode + ", userID=" + userID
				+ ", createDate=" + createDate + "]";
	}
	
	
	
}
