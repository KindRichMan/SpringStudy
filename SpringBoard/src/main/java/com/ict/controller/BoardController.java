package com.ict.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ict.domain.BoardVO;
import com.ict.mapper.BoardMapper;

@Controller
public class BoardController {
	
	
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	@GetMapping("/boardList")
	public String boardList(Model model) {
		
		List<BoardVO> boardList = boardMapper.getList();
		model.addAttribute("boardList",boardList);
		boardMapper.getList();
		return "boardList";
	}
	
	
	@GetMapping("/boardDetail")
	
	public String boardDetail(long bno, Model model) {
		BoardVO board  = boardMapper.select(bno);
		model.addAttribute("board", board);
		
		
		return "boardDetail";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}