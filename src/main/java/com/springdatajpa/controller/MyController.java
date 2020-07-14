package com.springdatajpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.entity.BaseClass;
import com.springdatajpa.entity.InheritedClassA;
import com.springdatajpa.service.BaseClassService;
import com.springdatajpa.service.InheritedClassAService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("my-rest")
public class MyController {

	@Autowired
	protected BaseClassService baseClassService;

	@Autowired
	protected InheritedClassAService inheritedClassAService;
	
	@ApiOperation(value = "List")
	@CrossOrigin(origins = "*")
    @GetMapping(value = "/list", produces = "application/json")
	public List<BaseClass> list() {
		
		for (int i = 0; i < 20; i++)
			baseClassService.save(new InheritedClassA(String.valueOf(i)));
		
		Pageable pageable = PageRequest.of(0, 10);
    	Page page = baseClassService.findAll(pageable);
    	
    	return page.toList();
    }
	
	@ApiOperation(value = "List")
	@CrossOrigin(origins = "*")
    @GetMapping(value = "/listA", produces = "application/json")
	public List<BaseClass> listA() {
		
		for (int i = 0; i < 20; i++)
			inheritedClassAService.save(new InheritedClassA(String.valueOf(i)));
		
		Pageable pageable = PageRequest.of(0, 10);
    	Page page = inheritedClassAService.findAll(pageable);
    	
    	return page.toList();
    }
}
