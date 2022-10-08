package com.briup.web.listener;

import com.briup.bean.Category;
import com.briup.service.impl.CategoryServiceImp;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.util.List;

/**
 * @author zqq
 * @date 2022/9/23
 */
@WebListener
public class indexLister implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("listen running");
        //获取servetContext对象
        ServletContext servletContext = servletContextEvent.getServletContext();
        //调用service对象
        CategoryServiceImp categoryServiceImp=new CategoryServiceImp();
        List<Category> Categorys = categoryServiceImp.findAllCategorys();
        //2.把查询结果存到最大的作用域中
        //xx.setAtribute("CategoryList",)
        servletContext.setAttribute("CategoryList",Categorys);
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
