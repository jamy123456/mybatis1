package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.User;

public interface UserMapper {
	
	User nestQuery(int id);
	
	int insertUser(User user);
	
	int updateUser(User user);
	
	int deleteUser(User user);
}
