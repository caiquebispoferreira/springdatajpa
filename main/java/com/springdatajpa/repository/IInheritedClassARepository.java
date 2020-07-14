package com.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.springdatajpa.entity.InheritedClassA;

public interface IInheritedClassARepository extends 
	JpaRepository<InheritedClassA, Long>, PagingAndSortingRepository<InheritedClassA, Long>, JpaSpecificationExecutor<IInheritedClassARepository>{

}
