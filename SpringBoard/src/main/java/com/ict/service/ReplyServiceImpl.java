package com.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.domain.ReplyVO;
import com.ict.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{

	
	
	@Autowired
	private ReplyMapper Mapper;
	
	
	
	@Override
	public List<ReplyVO> listReply(long bno) {
		// TODO Auto-generated method stub
		return Mapper.getList(bno);
	}



	@Override
	public void addReply(ReplyVO vo) {

         Mapper.create(vo);
		
	}



	@Override
	public void modifyReply(ReplyVO vo) {
	
		Mapper.update(vo);
	}



	@Override
	public void removeReply(Long rno) {
	
		
		Mapper.delete(rno);
		
	}

	

}
