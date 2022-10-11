package com.ict.persistance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.time.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTests {

	@Autowired
	private TimeMapper timeMapper;
	
	
	@Test
	public void testGetTime() {
		
		System.out.println("현재 시간 조회중");
		System.out.println(timeMapper.getTime());
	}
	
	 // testGetTime2()를 만들어서 timeMapper의 getTime2를 호출해주세요.
	 // 시간이 잘 찍히는지 확인해보세요.
	@Test
	public void testGetTime2() {;
	log.info("getTime2를 호출했습니다.");
	log.info(timeMapper.getTime2());
	}
	
   }
	
	
