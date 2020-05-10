package com.ss.training.borrower.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book_copies")
public class BookCopies implements Serializable{
	
	private static final long serialVersionUID = 8084402665858290667L;
	
	@ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "bookId")
	private Book book;
	
	@ManyToOne
    @MapsId("branchId")
    @JoinColumn(name = "branchId")
	private LibraryBranch branch;
	
	@Column(name = "noOfCopies")
	private Integer noOfCopies;
	
}
