package com.qfedu.service;
import java.util.List;

import com.qfedu.pojo.money;
public interface MoneyService {
	List<money> queryAll();
	void  del(String xid);
	void update(money money);
	List<money> findOne(money money);
	void add(money money);
}