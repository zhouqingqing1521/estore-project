package com.briup.web.servlet;
import com.briup.bean.Customer;
import com.briup.service.impl.ICustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.table.TableRowSorter;
import java.io.IOException;
/**
 * @author zqq
 * @date 2022/9/22
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ICustomerServiceImpl iCustomerService=new ICustomerServiceImpl();
        //接受前端传过来的参数
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String zipCode = req.getParameter("zipCode");
        String address = req.getParameter("address");
        String telephone = req.getParameter("telephone");
        String email = req.getParameter("email");

        Customer customer=new Customer();
        customer.setName(name);
        customer.setPassword(password);
        customer.setAddress(address);
        customer.setEmail(email);
        customer.setZipCode(zipCode);
        HttpSession session = req.getSession();
        try{
            iCustomerService.register(customer);
            //跳转到登录页
            resp.sendRedirect("/estore/login.jsp");
        }catch (Exception e){
            String message = e.getMessage();
            session.setAttribute("error",message);
            //跳转到注册页面
            resp.sendRedirect("/estore/register.jsp");
        }

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
