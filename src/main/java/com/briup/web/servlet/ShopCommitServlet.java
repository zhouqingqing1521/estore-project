package com.briup.web.servlet;
import com.briup.bean.Customer;
import com.briup.bean.ShopAddress;
import com.briup.bean.ShopCar;
import com.briup.service.impl.IShopAddressServiceImpl;
import com.briup.service.impl.IShopCarServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;
import java.io.IOException;
import java.util.List;
/**
 * @author zqq
 * @date 2022/9/27
 */
@WebServlet("/shopCommit")
public class ShopCommitServlet extends HttpServlet {
    private IShopAddressServiceImpl iShopAddressService=new IShopAddressServiceImpl();
    private IShopCarServiceImpl iShopCarService=new IShopCarServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //这个servlet用于提交订单
        HttpSession session = req.getSession();
       //首先你要查询当前用户的所有收货地址存到session以便cofirm显示
        Customer customer =(Customer) session.getAttribute("customer");
        Integer customerId = customer.getId();
        List<ShopAddress> addressList = iShopAddressService.findAddressByCustomerId(customerId);
        session.setAttribute("addressList",addressList);
        //清空当前用户的购物车
//       iShopCarService.deleteShopCarByCustomerId(customerId);
         //把session里的购物车记录放到一个confirmList里
        List<ShopCar> ShopCars = (List<ShopCar>) session.getAttribute("ShopCars");
        session.setAttribute("confirm",ShopCars);
        //移除原本的shopcars
        session.removeAttribute("ShopCars");
        //跳转到confirm.jsp
        resp.sendRedirect("/estore/confirm.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
