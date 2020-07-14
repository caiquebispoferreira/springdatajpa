package com.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.springdatajpa.entity.BaseClass;
import com.springdatajpa.entity.InheritedClassA;

public interface IBaseClassRepository extends 
	JpaRepository<BaseClass, Long>, PagingAndSortingRepository<BaseClass, Long>, JpaSpecificationExecutor<IBaseClassRepository>{

}
