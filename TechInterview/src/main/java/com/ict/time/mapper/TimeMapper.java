package com.ict.time.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	
	@Select("SELECT SYSDATE from dual")
	public String getTime();


	
	 public String getTime2();
	
	
 }     