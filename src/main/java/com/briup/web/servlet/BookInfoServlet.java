package com.briup.web.servlet;

import com.briup.bean.Book;
import com.briup.service.impl.IBookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author zqq
 * @date 2022/9/26
 */
@WebServlet("/bookInfo")
public class BookInfoServlet extends HttpServlet {
    private IBookServiceImpl iBookService=new IBookServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获得请求参数
        int bookId = Integer.parseInt(req.getParameter("bookId"));
        Book book = iBookService.findBookById(bookId);
        HttpSession session = req.getSession();

        session.setAttribute("bookInfo",book);
        //跳转到viewBook.jsp
        resp.sendRedirect("/estore/viewBook.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
