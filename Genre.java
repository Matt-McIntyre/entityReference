package com.ss.training.borrower.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_genre")
public class Genre implements Serializable{

	private static final long serialVersionUID = -3655735155901940805L;
	
	
	@Id
	@Column(name = "genre_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer genreId;
	
	@Column(name = "genreName")
	private String genreName;	
	
	@ManyToMany(mappedBy = "genres")
	private List<Book> books;
	
}
