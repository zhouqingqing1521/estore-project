package com.briup.web.servlet;
import com.briup.bean.Customer;
import com.briup.bean.OrderForm;
import com.briup.service.IOrderFormService;
import com.briup.service.impl.IOrderFormServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
/**
 * @author zqq
 * @date 2022/9/28
 */
@WebServlet("/orderList")
public class OrderListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IOrderFormService orderFormService = new IOrderFormServiceImpl();
        HttpSession session = req.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
//        customer.getId()通过这个方法获取到用户的id
        Integer customerId = customer.getId();
        List<OrderForm> orderFormList = orderFormService.findOrderFormByCustomerId(customerId);
        session.setAttribute("orderList",orderFormList);
        resp.sendRedirect("/estore/orderlist.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
