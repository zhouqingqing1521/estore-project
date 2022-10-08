package com.briup.mapper;

import com.briup.bean.ShopCar;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/**
 * @author zqq
 * @date 2022/9/26
 */
public interface ShopCarMapper {
    //保存购物车信息
    void saveShopCar(ShopCar sc);
    //更新购物车信息
    void updateShopCar(ShopCar sc);
    //根据书籍ID和顾客ID查找购物车信息
    ShopCar queryShopCarByCidAndBId(@Param("bookId") int bookId ,@Param("customerId") int customerId);
    //根据用户ID查找购物车信息
    List<ShopCar> findShopCarsByCustomer(Integer id);
    //根据用户id和书籍id删除书籍信息
    void deleteShopCarByCidAndBid(@Param("cid") int cid,@Param("bid") int bid);
    //根据用户id来删除购物车信息
    void deleteShopCarByCustomerId(int cid);
}
