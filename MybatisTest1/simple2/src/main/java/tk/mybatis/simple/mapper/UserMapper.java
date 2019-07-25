package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.User;

public interface UserMapper {
	
	User nestQuery(int id);
}
