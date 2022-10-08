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
@WebServlet("/shopCarDelete")
public class ShopCarDeleteServlet extends HttpServlet {
    private IShopCarServiceImpl iShopCarService=new IShopCarServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer bookId = Integer.valueOf(req.getParameter("bookId"));
        HttpSession session = req.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        Integer customerId = customer.getId();
       //调用对应的删除方法
        iShopCarService.deleteShopCarByCidAndBid(customerId,bookId);
        //在查询一下新的购物车记录
        List<ShopCar> shopCarList = iShopCarService.findShopCarsByCustomer(customerId);
        //如果查询出来的记录为空（删除的是最后一条购物车记录） 可以跳转到主页
        if(shopCarList.size()==0){
            resp.sendRedirect("/estore/index.jsp");
        }else{
            //覆盖原本的购物车session
            session.setAttribute("ShopCars",shopCarList);
            //跳转到购物车页面 重新渲染页面
            resp.sendRedirect("/estore/shopCart.jsp");
        }



    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
