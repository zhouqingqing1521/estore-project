package com.briup.service.impl;

import com.briup.bean.Book;
import com.briup.mapper.BookMapper;
import com.briup.service.IBookService;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author zqq
 * @date 2022/9/22
 */
public class IBookServiceImpl implements IBookService {
    private static SqlSessionFactory sqlSessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
    @Override
    public List<Book> findAllBooks() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Book> books = mapper.findAllBooks();
        return books;
    }

    @Override
    public Book findBookById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book bookById = mapper.findBookById(id);
        return bookById;
    }
}
