package com.eli.sp01.service;

import com.eli.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id,Integer score);
}
