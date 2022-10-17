package com.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.domain.BoardVO;
import com.ict.domain.Criteria;
import com.ict.mapper.BoardMapper;

@Service
public class BoardServicelmpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardVO> getList(Criteria cri) {
		
		return boardMapper.getList(cri);
	}

	@Override
	public void insert(BoardVO vo) {
		boardMapper.insert(vo);
		
	}

	@Override
	public int countPageNum() {
		
		return boardMapper.countPageNum();
	}

	@Override
	public BoardVO select(long bno) {
		
		return boardMapper.select(bno);
	}

	@Override
	public void delete(long bno) {
		boardMapper.delete(bno);
		
	}

	@Override
	public void update(BoardVO vo) {
		boardMapper.update(vo);
		
	}
	
	
	
}