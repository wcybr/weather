package com.qfedu.dao;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.qfedu.pojo.money;
public interface MoneyDao {
	
	@Insert("insert into money values (#{id},#{name},#{money},#{xid})")
	List<money> addMoney(money money);
	@Select("select * from money")
	@ResultType(money.class)
		List<money> selectAll();
	@Delete("delete  from money where xid= #{xid}")
void delete(String xid);
	@Update("update money set id=#{id},name=#{name},money=#{money},xid=#{xid} where xid=#{xid}")
	void update(money money);
	@Select("select * from money where xid= #{xid}")
	@ResultType(money.class)
	List<money> selectOne(money money);
	
}
