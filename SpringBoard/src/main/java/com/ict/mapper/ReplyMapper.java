package com.ict.mapper;

import java.util.List;

import com.ict.domain.ReplyVO;

public interface ReplyMapper {
	
	public List<ReplyVO> getList(Long bno);
	

	public void create(ReplyVO vo);
	

	public void update(ReplyVO vo);
	
	// 댓글번호로 삭제
	public void delete(Long rno);
	

}
