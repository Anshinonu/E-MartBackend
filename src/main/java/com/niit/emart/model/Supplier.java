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
public class Supplier implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2247024347698243942L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int supplierId;
	@Column(unique = true)
	private String supplierName;
	@Column(unique = true)
	private String supplierAddr;

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddr() {
		return supplierAddr;
	}

	public void setSupplierAddr(String supplierAddr) {
		this.supplierAddr = supplierAddr;
	}

}
