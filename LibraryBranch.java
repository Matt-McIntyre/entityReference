package com.ss.training.borrower.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_library_branch")
public class LibraryBranch implements Serializable {

	private static final long serialVersionUID = 3322696514580579092L;

	@Id
	@Column(name = "bookId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long branchId;

	@Column(name = "bookId")
	private String branchName;

	@Column(name = "bookId")
	private String branchAddress;

	@OneToMany(mappedBy = "branchId")
	private List<BookLoan> bookLoans;

	@OneToMany(mappedBy = "branchId")
	private List<BookCopies> bookCopies;

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public List<BookLoan> getBookLoans() {
		return bookLoans;
	}

	public void setBookLoans(List<BookLoan> bookLoans) {
		this.bookLoans = bookLoans;
	}

	public List<BookCopies> getBookCopies() {
		return bookCopies;
	}

	public void setBookCopies(List<BookCopies> bookCopies) {
		this.bookCopies = bookCopies;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookCopies, bookLoans, branchAddress, branchId, branchName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof LibraryBranch)) {
			return false;
		}
		LibraryBranch other = (LibraryBranch) obj;
		return Objects.equals(bookCopies, other.bookCopies) && Objects.equals(bookLoans, other.bookLoans)
				&& Objects.equals(branchAddress, other.branchAddress) && Objects.equals(branchId, other.branchId)
				&& Objects.equals(branchName, other.branchName);
	}

}
