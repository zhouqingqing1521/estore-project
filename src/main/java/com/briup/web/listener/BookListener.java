package com.briup.web.listener;

import com.briup.bean.Book;
import com.briup.service.impl.IBookServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

/**
 * @author zqq
 * @date 2022/9/23
 */
@WebListener
public class BookListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        //调用service对象
        IBookServiceImpl iBookService=new IBookServiceImpl();
        List<Book> allBooks = iBookService.findAllBooks();
        //放置到最大作用域
        servletContext.setAttribute("Books",allBooks);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
