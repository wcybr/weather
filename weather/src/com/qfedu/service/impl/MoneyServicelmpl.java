package com.qfedu.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qfedu.dao.MoneyDao;
import com.qfedu.pojo.money;
import com.qfedu.service.MoneyService;
@Service
public class MoneyServicelmpl implements MoneyService {
	@Autowired
	private MoneyDao dao;
	@Override
	public List<money> queryAll() {
		return dao.selectAll();
	}

public void del(String xid) {
  dao.delete(xid);
}
	
public void update(money money) {
	dao.update(money);
}
public List<money> findOne(money money) {
	return  dao.selectOne(money);
}

public void add(money money) {
	dao.addMoney(money);
}
}
