package com.ict.service;

import java.util.List;

import com.ict.domain.BoardVO;
import com.ict.domain.Criteria;

public interface BoardService {
	
	public List<BoardVO> getList(Criteria cri);
	
	public void insert(BoardVO vo);
	
	public int countPageNum();
	
	public BoardVO select(long bno);	
	
	public void delete(long bno);
	
	public void update(BoardVO vo);

}
