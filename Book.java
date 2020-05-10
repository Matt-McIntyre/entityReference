package com.ss.training.borrower.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book")
public class Book implements Serializable {

	private static final long serialVersionUID = -5416431360670324092L;

	@Id
	@Column(name = "bookId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;

	@Column(name = "title")
	private String title;

	@ManyToMany
	@JoinTable(name = "tbl_book_authors", joinColumns = @JoinColumn(name = "bookId"), inverseJoinColumns = @JoinColumn(name = "authorId"))
	private List<Author> authors;

	@ManyToMany
	@JoinTable(name = "tbl_book_genres", joinColumns = @JoinColumn(name = "bookId"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
	private List<Genre> genres;
	
	@ManyToOne
    @JoinColumn(name="pubId", nullable=false)
	private Publisher publisher;
	
	@OneToMany(mappedBy = "bookId")
	private List<BookLoan> bookLoans;
	
	@OneToMany(mappedBy = "bookId")
	private List<BookCopies> bookCopies;



}