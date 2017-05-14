package org.huasuoworld.dao;

import org.apache.ibatis.annotations.Mapper;
import org.huasuoworld.common.po.User;

@Mapper
public interface UserDAO {
	
	User selectByPrimaryKey(String ID);
	
	void insert(User user);
}