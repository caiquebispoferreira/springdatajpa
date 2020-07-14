package com.springdatajpa.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.springdatajpa.entity.BaseClass;
import com.springdatajpa.repository.IBaseClassRepository;
import com.springdatajpa.repository.IInheritedClassARepository;

@Service
public class BaseClassService {

	@Autowired
	private IBaseClassRepository repository;
	
	public Page findAll(Specification spec , Pageable pageable){
		return repository.findAll(spec, pageable);
	}
	
	public Page findAll( Pageable pageable){
		return repository.findAll(pageable);
	}
	
	public void save(BaseClass b) {
		repository.save(b);
	}
}
