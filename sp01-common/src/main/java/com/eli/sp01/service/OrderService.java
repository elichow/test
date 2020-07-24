package com.eli.sp01.service;

import com.eli.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}
