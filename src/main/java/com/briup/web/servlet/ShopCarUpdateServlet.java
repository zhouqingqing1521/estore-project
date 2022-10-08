package com.briup.web.servlet;
import com.briup.bean.Customer;
import com.briup.bean.ShopCar;
import com.briup.service.impl.IShopCarServiceImpl;
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
 * @date 2022/9/27
 */
@WebServlet("/shopCarUpdate")
public class ShopCarUpdateServlet extends HttpServlet {
    private IShopCarServiceImpl iShopCarService=new IShopCarServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收请求参数
        Integer num =(Integer.parseInt(req.getParameter("num")));

        Integer bookId =(Integer.parseInt(req.getParameter("bookId")));

        HttpSession session = req.getSession();
        Customer customer =(Customer) session.getAttribute("customer");
        //获取用户id
        Integer customerId = customer.getId();
        //封装成一个shopcar对象
        ShopCar shopCar=new ShopCar(num,bookId,customerId);
        //调用方法
        iShopCarService.updateShopCar(shopCar);
        //查询当前用户的所有购物信息
        List<ShopCar> shopCarsByCustomer = iShopCarService.findShopCarsByCustomer(customerId);

        //把结果集放进session 跳转到shopcat
        session.setAttribute("ShopCars",shopCarsByCustomer);
        resp.sendRedirect("/estore/shopCart.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
