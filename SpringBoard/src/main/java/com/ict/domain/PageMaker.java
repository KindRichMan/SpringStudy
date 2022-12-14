package com.ict.domain;

import lombok.Data;

@Data

public class PageMaker {
	
	private int totalBoard;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	
	private int displayPageNum;
	
	
	private SearchCriteria cri;
	
	
	
	
	public  void calcData() {
		this.displayPageNum=10;
		
	
	
	
	this.endPage = (int) (Math.ceil(cri.getPageNum()  /   (double) displayPageNum) * displayPageNum);
	
	this.startPage = (endPage - displayPageNum) + 1;
			
	
	
	// 마지막 페이지 보정 - 10개를 맞춰지지 않을때 최종 페이지 보여줌. 
	int tempEndPage = (int)(Math.ceil(totalBoard / (double)cri.getNumber()));
	
	if(endPage > tempEndPage) {
		endPage = tempEndPage;
	}
	
	
	
	
	
	prev = startPage == 1 ? false : true;
	
	
	
	next = endPage * cri.getNumber() >= totalBoard ? false : true;
	
	}
	
	
	
	public void setTotalBoard(int totalBoard) {
		this.totalBoard = totalBoard;
		calcData();
		
		
	

}

}


