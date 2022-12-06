package com.ict.persistence;

import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.domain.BoardVO;
import com.ict.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	
	@Autowired
	private BoardMapper boardMapper;
	
	
	//@Test
	public void testGetList() {
	//	List<BoardVO> reault = baordMapper.getList();
	//	log.info("저장된 게시물 정보:" +result);
		log.info(boardMapper.getList(cri));
	}
	
	
	
	//@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		log.info("채워넣기전:" + vo);
		vo.setName("김방구");
		vo.setAddress("남성동");
		vo.setUniversity("서울시립대");
		vo.setMajor("연극학");
		
		
		
		log.info("채워넣은 후 :" + vo);
		
		boardMapper.insert(vo);
		
	}
	
	//@Test 
	public void testSelect() {
	//	BoardVO vo = boardMapper.select(49195);
	//	log.info(vo);
		
		boardMapper.select(21);
		log.info(boardMapper.select(21));
		
	}
	  
	
	//@Test
	public void delete() {
	    
		boardMapper.delete(22);
		//log.info(boardMapper.delete(49194));
	}
	
	
	@Test
	public void update() {
	BoardVO vo = new BoardVO();
		vo.setName("바뀐이름");
		vo.setAddress("바뀐주소");
		vo.setUniversity("바뀐대학교");
		vo.setMajor("바뀐학과");
		vo.setBno(21);
	log.info("바뀐자료 : " + vo);
	
	boardMapper.update(vo);
	
		
	}
	
}




