package com.briup.service.impl;
import com.briup.bean.ShopCar;
import com.briup.mapper.ShopCarMapper;
import com.briup.service.IShopCarService;
import com.briup.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;
/**
 * @author zqq
 * @date 2022/9/26
 */
public class IShopCarServiceImpl implements IShopCarService {
    private static SqlSessionFactory sqlSessionFactory = MyBatisSqlSessionFactory.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    ShopCarMapper mapper = sqlSession.getMapper(ShopCarMapper.class);
    //根据用户id和书籍id删除书籍信息
    @Override
    public void deleteShopCarByCidAndBid(int cid, int bid) {
        mapper.deleteShopCarByCidAndBid(cid,bid);
        sqlSession.commit();
    }

    @Override
    public void saveShopCar(ShopCar sc) {

        //如果当前用户在shopcar表中已经有对应的记录 应该在原有的基础上添加数目
        //如没有直接添加一条新记录
        //根据用户id和书籍id查询该用户有没有添加新的记录
        ShopCar shopCar = mapper.queryShopCarByCidAndBId(sc.getBookId(), sc.getCustomerId());
        //如果有
        System.out.println(shopCar);
        if (shopCar!=null){
            int sum = shopCar.getNum()+sc.getNum();
            shopCar.setNum(sum);
            mapper.updateShopCar(shopCar);
            sqlSession.commit();
        }else {
//            若没有
            mapper.saveShopCar(sc);
        }
    }
    //更新购物车信息
    @Override
    public void updateShopCar(ShopCar sc) {
        mapper.updateShopCar(sc);
        sqlSession.commit();
    }
    @Override
    public ShopCar queryShopCarByCidAndBId(int cid, int bid) {
        return null;
    }

    @Override
    public List<ShopCar> findShopCarsByCustomer(Integer id) {
        return mapper.findShopCarsByCustomer(id);
    }
    @Override
    public void deleteShopCarByCustomerId(int cid) {
        mapper.deleteShopCarByCustomerId(cid);
        sqlSession.commit();
    }
}
