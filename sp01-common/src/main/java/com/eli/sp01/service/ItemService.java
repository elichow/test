package com.eli.sp01.service;

import java.util.List;

import com.eli.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item>list);
}
