package com.ict.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private long bno;
	private String name;
	private String address;
	private String university;
	private String major;
	private Date regdate;
	private Date updatedate;

}
