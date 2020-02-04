package com.accp.service;

import java.util.List;

import org.apache.ibatis.annotations.AutomapConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Order;
import com.accp.domain.Staff;
import com.accp.mapper.OrderMapper;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class HbService {

	
	@Autowired
	OrderMapper ordermapper;
	
	@Autowired
	StaffMapper staffmapper;
	
	//查询服务顾问
	public List<Staff> toFind(){
		return staffmapper.selectByExample(null);
	}
	
}
