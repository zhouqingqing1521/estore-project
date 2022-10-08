package com.briup.mapper;

import com.briup.bean.Customer;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {

	void saveCustomer(Customer customer);
	Customer findCustomerByName(String name);
}
