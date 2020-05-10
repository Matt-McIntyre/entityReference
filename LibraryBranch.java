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
@Table(name = "tbl_library_branch")
public class LibraryBranch implements Serializable{
	
	private static final long serialVersionUID = 3322696514580579092L;
	
	@Id
	@Column(name = "bookId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer branchId;
	
	@Column(name = "bookId")
	private String branchName;
	
	@Column(name = "bookId")
	private String branchAddress;
	
	@OneToMany(mappedBy = "branchId")
	private List<BookLoan> bookLoans;
	
	@OneToMany(mappedBy = "branchId")
	private List<BookCopies> bookCopies;

}
