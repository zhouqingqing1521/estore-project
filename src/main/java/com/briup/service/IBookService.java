package com.briup.service;

import java.util.List;

import com.briup.bean.Book;

public interface IBookService {
	//查询所有书籍信息
	List<Book> findAllBooks();
	//通过书籍ID查询书籍信息
	Book findBookById(Integer id);
}
