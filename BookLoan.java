/**
 * 
 */
package com.ss.training.borrower.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book_loans")
public class BookLoan implements Serializable{
	
	private static final long serialVersionUID = -326651163829760200L;	
	
	@ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "bookId")	
	private Book book;
	
	@ManyToOne
    @MapsId("branchId")
    @JoinColumn(name = "branchId")
	private LibraryBranch branch;
	
	@ManyToOne
    @MapsId("cardNo")
    @JoinColumn(name = "cardNo")
	private Borrower borrower;
	
	@Column(name = "dateOut")
	private Date dateOut;
	
	@Column(name = "dueDate")
	private Date dueDate;
	
	@Column(name = "dateIn")
	private Date dateIn;	
	
}
