package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Staff;
import com.accp.service.HbService;

@RestController
@RequestMapping("/")
public class HbController {
	
	@Autowired
	HbService service;

	@GetMapping("/to")
	public String to() {
		return "find";
	}
	
	
	@GetMapping("/toWxd")
	public List<Staff> toWxd(){
		System.out.println("");
		//查询服务顾问
		List<Staff> list = service.toFind();
		return list;
	}
	
}
