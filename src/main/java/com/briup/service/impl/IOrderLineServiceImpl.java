package com.briup.service.impl;

import com.briup.bean.OrderLine;
import com.briup.mapper.OrderLineMapper;
import com.briup.service.IOrderLineService;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author zqq
 * @date 2022/9/28
 */
public class IOrderLineServiceImpl implements IOrderLineService {
    private static SqlSessionFactory sqlSessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    OrderLineMapper mapper = sqlSession.getMapper(OrderLineMapper.class);
    @Override
    public void saveOrderLine(OrderLine ol) {
       mapper.saveOrderLine(ol);
       sqlSession.commit();
    }

    @Override
    public List<OrderLine> findOrderLineByOrderId(Integer id) {
        return null;
    }
}
