package com.ict.controller;


import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ict.domain.ReplyVO;
import com.ict.mapper.ReplyMapper;
import com.ict.service.ReplyService;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/replies")
@Log4j
public class ReplyController {
	
	@Autowired
	private ReplyService Service;
	
	@PostMapping(value ="", consumes="application/json",produces= {MediaType.TEXT_PLAIN_VALUE,   
			                              })
	
	public ResponseEntity<String> register(@RequestBody ReplyVO vo){
		
		ResponseEntity<String> entity = null;
		
		try {
			Service.addReply(vo);
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
					
			
			
		}catch(Exception e) {
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
	
	
	@GetMapping(value="/all/{bno}", 
			produces= { MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE})

	public ResponseEntity<List<ReplyVO>> list(@PathVariable("bno") Long bno){
		 ResponseEntity<List<ReplyVO>> entity = null;
		 
		 try {
			 entity = new ResponseEntity<>(
					 Service.listReply(bno), HttpStatus.OK);
					 
					 
		 }catch(Exception e) {
			 e.printStackTrace();
			 entity = new ResponseEntity(HttpStatus.BAD_REQUEST);
		 }
		return entity;
	}
}
