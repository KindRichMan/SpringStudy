package com.ict.domain;

import lombok.Data;

@Data
public class PageMaker {
	
	private int totalBoard;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;

	
	
	private int	displayPageNum;
	
	private SearchCriteria cri;
	
	public void calcData() {
		this.displayPageNum=10;
		
		//끝페이지
		this.endPage = (int)(Math.ceil(cri.getPageNum() / (double) displayPageNum) * displayPageNum);
		
		//시작페이지
		this.startPage = (endPage - displayPageNum) + 1;
		
		int tempEndPage = (int)(Math.ceil(totalBoard / (double)cri.getNumber()));
		
		//실제 마무리 페이지
		if(endPage > tempEndPage) {
			endPage = tempEndPage;
		}
		
		
		//next,prev 버튼 여부 처리
		prev = startPage == 1 ? false : true;
		
		
		
		
		
		next = endPage * cri.getNumber() >= totalBoard ? false : true;
		
		
	}
	
	
	public void setTotalBoard(int totalBoard) {
		this.totalBoard = totalBoard;
		calcData();
	}
	
	
	
	
}
