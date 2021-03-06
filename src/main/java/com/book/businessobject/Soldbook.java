package com.book.businessobject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Soldbook")
public class Soldbook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="date")
	private Date solddate;

	@OneToOne
	private Book book;
	
	public Soldbook()
	{
		
	}
	public Soldbook(Book book, Date solddate)
	{
		this.book = book;
		this.solddate = solddate;
	}
	public Long getId() {
		return id;
	}
	public Date getSolddate() {
		return solddate;
	}
	public Book getBook() {
		return book;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSolddate(Date solddate) {
		this.solddate = solddate;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	
	

}
