package com.briup.web.servlet;
import com.briup.bean.*;
import com.briup.service.IOrderFormService;
import com.briup.service.IOrderLineService;
import com.briup.service.impl.IOrderFormServiceImpl;
import com.briup.service.impl.IOrderLineServiceImpl;
import com.briup.service.impl.IShopAddressServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author zqq
 * @date 2022/9/28
 */
@WebServlet("/orderCommit")
public class OrderCommitServlet extends HttpServlet {
    private IShopAddressServiceImpl shopAddressService=new IShopAddressServiceImpl();
    private IOrderFormService orderFormService=new IOrderFormServiceImpl();
    private IOrderLineService orderLineService=new IOrderLineServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1、接收参数
        String receiveName = req.getParameter("receiveName");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String shopAddId = req.getParameter("shopAddId");
        //获取当前登录用户
        HttpSession session = req.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
//        ....接收其他参数
//        判断一下地址是新增还是 原来的地址
//        如果说 前端获取到的receiveName，address，phone不为空的话 就认为要新增地址
//        判断receiveName是否为空 还要判断address phone
        ShopAddress shopAddress = new ShopAddress();
        if(receiveName.equals("")&&phone.equals("")&&address.equals("")){
            //使用旧地址
            //没有选择地址情况下
            if(shopAddId.equals("")){
                resp.sendRedirect("/estore/confirm.jsp");
                return;
            }else{
                Integer addId = Integer.valueOf(shopAddId);
                shopAddress.setId(addId);
            }
        }else{
//            不为空为新地址
            shopAddress.setAddress(address);
            shopAddress.setReceiveName(receiveName);
            shopAddress.setPhone(phone);
            shopAddress.setCustomer(customer);
            shopAddressService.saveAddress(shopAddress);
        }
//        可以通过接收参数的形式获取旧地址的id
//        通过这个地址id查询地址信息（拿到id之后new ShopAddress只把id放进去）
//        开始准备一个OrderForm对象（时间可以直接newDate）
        List<ShopCar> shopCarList = (List<ShopCar>) session.getAttribute("confirm");
        Double total = 0.0;
        for (ShopCar shopCar : shopCarList) {
            total = total + (shopCar.getNum()*shopCar.getBook().getPrice());
        }

        OrderForm orderForm = new OrderForm();
        orderForm.setCost(total);
        orderForm.setOrderdate(new Date());
        orderForm.setShopAddress(shopAddress);
        orderForm.setCustomer(customer);

//        并且调用对应的方法saveOrderForm（需要selectkey）
        orderFormService.saveOrderForm(orderForm);
//        把他对应的订单项存入数据库当中（需要订单表的id）
        for (ShopCar shopCar : shopCarList) {
            OrderLine orderLine = new OrderLine();
            orderLine.setBook(shopCar.getBook());
            orderLine.setNum(Long.valueOf(shopCar.getNum()));
            orderLine.setCost(shopCar.getNum()*shopCar.getBook().getPrice());
            orderLine.setOrderForm(orderForm);
            orderLineService.saveOrderLine(orderLine);
        }
//        结束
        resp.sendRedirect("/estore/orderlist.jsp");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
