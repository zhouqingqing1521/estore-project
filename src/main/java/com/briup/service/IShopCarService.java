package com.briup.service;

import java.util.List;

import com.briup.bean.ShopCar;
import org.apache.ibatis.annotations.Param;

public interface IShopCarService {
	//保存购物车信息
	void saveShopCar(ShopCar sc);
	//更新购物车信息
	void updateShopCar(ShopCar sc);
	//根据书籍ID和顾客ID查找购物车信息
	ShopCar queryShopCarByCidAndBId( int customerId, int bookId);
	//根据书籍ID查找购物车信息
	List<ShopCar> findShopCarsByCustomer(Integer id);
	//根据用户id和书籍id删除书籍信息
	void deleteShopCarByCidAndBid(int cid,int bid);
	//根据用户id来删除购物车信息
	void deleteShopCarByCustomerId(int cid);
}
