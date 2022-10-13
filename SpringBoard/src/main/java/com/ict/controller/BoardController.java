package com.ict.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ict.domain.BoardVO;
import com.ict.domain.Criteria;
import com.ict.domain.PageMaker;
import com.ict.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@Controller

public class BoardController {
	
	
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	@GetMapping("/boardList")
	public String boardList( Criteria cri ,Model model) {
		
		List<BoardVO> boardList = boardMapper.getList( cri);
		model.addAttribute("boardList",boardList);
		
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		int countPage = boardMapper.countPageNum();
		pageMaker.setTotalBoard(countPage);
		model.addAttribute("pageMaker", pageMaker);
		
		
		return "boardList";
	}
	
	
	@GetMapping("/boardDetail/{bno}")
	
	public String boardDetail(@PathVariable long bno, Model model) {
		BoardVO board  = boardMapper.select(bno);
		model.addAttribute("board", board);
		
		
		return "boardDetail";
	}
	
	
	@GetMapping("/boardInsert")
	public String boardForm() {
		
		return "boardForm";
	}
	
	@PostMapping("/boardInsert")
	public String boardInsert(BoardVO board, Model model) {
		System.out.print(board);
		boardMapper.insert(board);
		
		return "redirect:/boardList";
	}
	
	@PostMapping("/boardDelete")
	public String boardDelete(long bno) {
		
		boardMapper.delete(bno);
		
		return "redirect:/boardList";
	}
	
	
    @PostMapping("/boardUpdateForm")
    public String boardUpdateForm(long bno,Model model) {
    	BoardVO board = boardMapper.select(bno);
		model.addAttribute("board", board);
		
    	
    	return "boardUpdateForm";
    }
    
    @PostMapping("/boardUpdate")
    public String boardUpdate(BoardVO board) {
    	
    	    boardMapper.update(board);
    	return "redirect:/boardDetail/"+ board.getBno();
    }
	
	
	
	
	
	
	
	
	
	
	

}
