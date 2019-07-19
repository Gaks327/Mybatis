package dao;

import java.util.List;

import bean.Role;
import bean.User;
import bean.User1;

public interface UserMapper {
   
	
	List<User1> select();
	
	List<Role> selectRole();
	
	List<User1> selectUser();
}