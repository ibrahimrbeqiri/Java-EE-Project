package com.book.businessobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="title")
	private String title;
	@Column(name="isbn")
	private String isbn;
	@Column(name="publisher")
	private String publisher;
	@Column(name="publishing_date")
	private String publishingDate;
	@Column(name="pages")
	private int numberOfPages;
	@Column(name="isRented")
	private boolean isRented;
	@Column(name="cover")
	private String cover;
	@Column(name="price")
	private double price;
	@Column(name="sold")
	private boolean isSold;
	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private Writer author;
	

	public Book(){

	}
	
	public Book(String title, String isbn, String publisher, String publishingDate, int numberOfPages, boolean isRented, String cover, double price, boolean isSold)
	{
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
		this.publishingDate = publishingDate;
		this.numberOfPages = numberOfPages;
		this.isRented = isRented;
		this.cover = cover;
		this.price = price;
		this.isSold = isSold;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getPublishingDate() {
		return publishingDate;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public boolean isRented() {
		return isRented;
	}

	public String getCover() {
		return cover;
	}

	public Category getCategory() {
		return category;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPublishingDate(String publishingDate) {
		this.publishingDate = publishingDate;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Writer getAuthor() {
		return author;
	}

	public void setAuthors(Writer author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSold() {
		return isSold;
	}

	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}
}
