package com.ict.time.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT SYSDATE from dual")
	public String getTime();

	// 2. 메서드만 만들어 놓고 외부 XML파일과 연동해 해당 파일에 쿼리문 작성(주로 쓰는 방법)
	public String getTime2();

}
