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
@Table(name = "tbl_publisher")
public class Publisher implements Serializable{

	private static final long serialVersionUID = -8393917397273467905L;
	
	@Id
	@Column(name = "publisherId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer publisherId;
	
	@Column(name = "pulbisherName")
	private String publisherName;
	
	@Column(name = "publisherAddress")
	private String publisherAddress;
	
	@Column(name = "publisherPhone")
	private String publisherPhone;
	
	@OneToMany(mappedBy="publisher")
	private List<Book> publishedBooks;
	
	
}