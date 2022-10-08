package com.briup.mapper;

import java.util.List;

import com.briup.bean.Book;

public interface BookMapper {
	List<Book> findAllBooks();
	Book findBookById(Integer id);
}
