package com.cdac;
import java.time.LocalDate;
public class Book {
	private String title;
	private BookType bookType;
	private Double price;
	private LocalDate publishedDate;
	private String authorName;
	private Integer quantity;
	
	public Book() {
		super();
	}
	
	public Book(String title, BookType bookType, Double price, LocalDate publishedDate, String authorName, Integer quantity) {
		super();
		this.title = title;
		this.bookType = bookType;
		this.price = price;
		this.publishedDate = publishedDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public BookType getBookType() {
		return bookType;
	}
	
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	public String getAutherName() {
		return authorName;
	}
	
	public void setAutherName(String autherName) {
		this.authorName = autherName;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Book Details : [ title=" + title
				+ ", book type=" + bookType
				+ ", price=" + price
				+ ", published on=" + publishedDate
				+ ", auther=" + authorName
				+ ", avaible quantity=" + quantity
				+ " ]";
	}
	
}
