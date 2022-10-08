package com.briup.web.servlet;
import com.briup.bean.Customer;
import com.briup.service.impl.ICustomerServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/**
 * @author zqq
 * @date 2022/9/22
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private ICustomerServiceImpl iCustomerService=new ICustomerServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        try{
            Customer customer = iCustomerService.login(name, password);
            session.setAttribute("customer",customer);
            //跳转到主页
            resp.sendRedirect("/estore/index.jsp");
        }catch (Exception e){
            //跳转到登录页面
            String message = e.getMessage();
            session.setAttribute("error",message);
            resp.sendRedirect("/estore/login.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
