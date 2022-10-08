package com.briup.service.impl;
import com.briup.bean.OrderForm;
import com.briup.mapper.OrderFormMapper;
import com.briup.service.IOrderFormService;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
/**
 * @author zqq
 * @date 2022/9/28
 */
public class IOrderFormServiceImpl implements IOrderFormService {
    private static SqlSessionFactory sqlSessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    OrderFormMapper mapper = sqlSession.getMapper(OrderFormMapper.class);
    @Override
    public void saveOrderForm(OrderForm of) {
       mapper.saveOrderForm(of);
       sqlSession.commit();
    }

    @Override
    public OrderForm findOrderFormByOrderid(Long orderid) {
        return null;
    }

    @Override
    public List<OrderForm> findOrderFormByCustomerId(Integer id) {
        return mapper.findOrderFormByCustomerId(id);
    }

    @Override
    public void deleteOrderFormById(Integer id) {

    }
}
