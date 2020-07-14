package com.springdatajpa.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity 
@Table 
@Inheritance(strategy = InheritanceType.JOINED) 
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING, length = 63) 
@DiscriminatorValue("BASECLASS") 
@Where(clause="DELETED = 0" ) 
public class BaseClass  { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
    @Column(name = "DELETED" ,nullable = true)
    protected Boolean deleted = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
    
    
    
}