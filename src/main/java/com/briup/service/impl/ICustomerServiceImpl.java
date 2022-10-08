package com.briup.service.impl;

import com.briup.bean.Customer;
import com.briup.mapper.CustomerMapper;
import com.briup.service.ICustomerService;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.concurrent.Callable;

/**
 * @author zqq
 * @date 2022/9/22
 */
public class ICustomerServiceImpl implements ICustomerService {
    private static  SqlSessionFactory sqlSessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
    //注册用户信息
    @Override
    public void register(Customer customer) {
        //判断用户名是否为空
        if (customer.getName()==null){
            throw new RuntimeException("用户名为空");
        }
        //判断用户名是否存在
        Customer name = mapper.findCustomerByName(customer.getName());
        if (name!=null){
            throw  new RuntimeException("用户名已存在");
        }
        //存入数据库
        mapper.saveCustomer(customer);
        sqlSession.commit();
        sqlSession.close();
    }
    //通过用户名字查找用户信息
    @Override
    public Customer findCustomerByName(String name) {
        Customer customerByName = mapper.findCustomerByName(name);
        return customerByName;
    }
    //根据用户名以及密码查看用户信息
    @Override
    public Customer login(String name, String password) {
        //判断用户名是否为空
        if (name==null||name.trim().equals("")){
            throw new RuntimeException("用户名为空");
        }
        if (password==null||password.trim().equals("")){
            throw new RuntimeException("密码不能为空");
        }

        Customer customer = findCustomerByName(name);
        if (!customer.getPassword().equals(password)){
            throw new RuntimeException("密码错误");
        }
        return customer;
    }
}
