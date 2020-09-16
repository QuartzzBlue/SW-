package com.quartz.boot.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class DoubleResponseVO{
	@JsonProperty
	private String date;
	@JsonProperty
	private double cnt;
	
}

