package com.briup.mapper;

import java.util.List;

import com.briup.bean.ShopAddress;

public interface ShopAddressMapper {
	List<ShopAddress> findAddressByCustomerId(Integer id);
	void saveAddress(ShopAddress sd);
	ShopAddress findShopAddressById(Integer id);

}
