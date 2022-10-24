package com.ict.service;

import java.util.List;

import com.ict.domain.ReplyVO;

public interface ReplyService {
	
	public List<ReplyVO> listReply(long bno);
	

	public void addReply(ReplyVO vo);
	

	public void modifyReply(ReplyVO vo);
	
	// 댓글번호로 삭제
	public void removeReply(Long rno);
	


}
