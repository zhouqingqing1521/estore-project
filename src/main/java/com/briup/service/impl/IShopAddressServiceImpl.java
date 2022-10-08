package com.briup.service.impl;
import com.briup.bean.ShopAddress;
import com.briup.mapper.CustomerMapper;
import com.briup.mapper.ShopAddressMapper;
import com.briup.service.IShopAddressService;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;
/**
 * @author zqq
 * @date 2022/9/27
 */
public class IShopAddressServiceImpl implements IShopAddressService {
    private static SqlSessionFactory sqlSessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    ShopAddressMapper mapper = sqlSession.getMapper(ShopAddressMapper.class);
    @Override
    public List<ShopAddress> findAddressByCustomerId(Integer id) {
        List<ShopAddress> addressByCustomerId = mapper.findAddressByCustomerId(id);
        return addressByCustomerId;
    }

    @Override
    public void saveAddress(ShopAddress sd) {

    }
    //根据用户id来删除购物车信息

}
