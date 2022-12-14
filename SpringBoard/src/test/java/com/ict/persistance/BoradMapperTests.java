package com.ict.persistance;

import java.util.List;

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
public class BoradMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;

	@Test
	public void testGetList() {
	
		List<BoardVO> result = boardMapper.getList();
		
		log.info(boardMapper.getList());
	}
	
	
	//@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		log.info("채워넣기전 : " + vo);
		
		vo.setTitle("테스트입력글");
		vo.setContent("테스트 본문");
		vo.setWriter("테스트 글쓴이");
		
		log.info(vo);
		
		boardMapper.insert(vo);
	}
	
	//@Test
	public void getSelect() {
		
		BoardVO vo = boardMapper.select(21);
		log.info(vo);
		
		
	}
	
	
	//@Test
	public void delete() {
		 boardMapper.delete(1);
		
	}
	
	//@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
	   log.info("전달 데이터 없을떄 :"  + board);
		
		board.setTitle("바꿀제목");
		board.setContent("바꿀본문");
		board.setBno(21);
		log.info("전달 데이터 변경후:"  + board);
		
		boardMapper.update(board);
		
	}
	
	
	
	
}
