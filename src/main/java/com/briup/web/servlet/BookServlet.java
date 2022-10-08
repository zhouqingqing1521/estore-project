package com.briup.web.servlet;
import com.alibaba.fastjson.JSON;
import com.briup.bean.Book;
import com.briup.bean.Category;
import com.briup.service.ICustomerService;
import com.briup.service.impl.IBookServiceImpl;
import com.briup.service.impl.ICustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author zqq
 * @date 2022/9/22
 */
@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
    private IBookServiceImpl iBookService=new IBookServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = iBookService.findAllBooks();
        String jsonString = JSON.toJSONString(books);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
