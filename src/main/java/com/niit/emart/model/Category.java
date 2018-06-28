package com.niit.emart.model;

import java.io.Serializable;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1952727130967582839L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Categoryid;
	@Column(unique = true)
	private String CategoryName;
	private String CategoryDesc;

	public int getCategoryid() {
		return Categoryid;
	}

	public void setCategoryid(int categoryid) {
		Categoryid = categoryid;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getCategoryDesc() {
		return CategoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		CategoryDesc = categoryDesc;
	}

}
