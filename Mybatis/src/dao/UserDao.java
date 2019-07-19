package dao;

import java.util.List;
import java.util.Map;

import bean.Admin;

public interface UserDao {

	
	public List<Admin> findAll();
	
	public Admin selectById(int id);
	
	public int delate();
	
	public int insert(Admin admin);
	public int insert1(Map<String, Object> admin);
	public int insert2(List<String> admin);
}
