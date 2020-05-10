package com.ss.training.borrower.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_borrower")
public class Borrower implements Serializable{

	private static final long serialVersionUID = -4691814048768809869L;
	
	@Id
	@Column(name = "cardNo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cardNo;
	
	@Column(name = "name")
	private String borrowerName;
	
	@Column(name = "address")
	private String borrowerAddress;
	
	@Column(name = "phone")
	private String borrowerPhone;
	
	@OneToMany(mappedBy = "cardNo")
	private List<BookLoan> bookLoans;
	

}
