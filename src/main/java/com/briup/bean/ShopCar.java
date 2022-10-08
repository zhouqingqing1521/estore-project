package com.briup.bean;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 * 购物车类
 */
public class ShopCar implements Serializable{
	private Integer id;
	private int num;
	private int bookId;
	private int customerId;
	private Book book;
	private Customer customer;

	public ShopCar(Integer num, Integer bookId, Integer customerId) {
		this.num = num;
		this.bookId = bookId;
		this.customerId = customerId;
	}

	public ShopCar() {

	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
